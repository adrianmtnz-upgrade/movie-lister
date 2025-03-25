package com.movie_lister._02_data;

import java.util.List;

import com.movie_lister._01_objects.Movie;
import com.movie_lister._04_exceptions.DataAccessException;
import com.movie_lister._04_exceptions.DataReaderException;
import com.movie_lister._04_exceptions.DataWriterException;

public interface DataAccessible {
    
    public boolean checkFileExistance();

    public void createFile(String resourceRelPath) throws DataAccessException;
    
    public void deleteFile(String resourceRelPath) throws DataAccessException;

    public void writeMovie(Movie movie, String resourceRelPath, boolean append) throws DataWriterException;

    public List<Movie> readMovies(String resourceRelPath) throws DataReaderException;

    public String searchMovies(String resourceRelPath, String movieToSearch) throws DataReaderException;
}
