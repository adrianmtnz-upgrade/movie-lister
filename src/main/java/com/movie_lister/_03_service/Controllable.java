package com.movie_lister._03_service;

import com.movie_lister._04_exceptions.DataAccessException;
import com.movie_lister._04_exceptions.DataReaderException;

public interface Controllable {
    public void initiateController() throws DataAccessException;
    public void listMovies() throws DataReaderException;
    public void addMovie(String title) throws DataAccessException;
    public void deleteMovie(String title);
    public void searchMovie(String movieToSearch);
}
