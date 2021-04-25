package com.kaio.ribeiro.springessentials.repository;

import com.kaio.ribeiro.springessentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
