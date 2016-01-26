package ru.dvortsov.springlibrary.dao.interfaces;

import ru.dvortsov.springlibrary.entities.Genre;

import java.util.List;

public interface GenreDAO {
    List<Genre> getGenres();
}
