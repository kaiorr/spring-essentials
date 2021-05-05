package com.kaio.ribeiro.springessentials.service;

import com.kaio.ribeiro.springessentials.domain.Anime;
import com.kaio.ribeiro.springessentials.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static final List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(new Anime( 1L, "Boku No Hero"), new Anime( 2L, "Berserk"), new Anime(3L, "Cavaleiros do Zodiaco")));
    }

    public List<Anime> listAll() {
     return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id)).findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found :( "));

    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 10000));
        animes.add(anime);
        return anime;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }

    public void replace(Anime anime) {
        delete(anime.getId());
        animes.add(anime);
    }
}
