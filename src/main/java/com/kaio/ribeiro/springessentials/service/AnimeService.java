package com.kaio.ribeiro.springessentials.service;

import com.kaio.ribeiro.springessentials.domain.Anime;
import com.kaio.ribeiro.springessentials.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll() {
     return List.of(new Anime( 1L, "Boku No Hero"), new Anime( 2L, "Berserk"));
    }
}
