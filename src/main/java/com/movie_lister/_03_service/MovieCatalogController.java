package com.movie_lister._03_service;

import java.io.*;

import com.movie_lister._01_objects.Movie;
import com.movie_lister._02_data.FileDataAccess;
import com.movie_lister._04_exceptions.*;

public class MovieCatalogController implements Controllable {

    private final FileDataAccess data;

    public MovieCatalogController( FileDataAccess data){
        this.data = data;
    } 

    @Override
    public void initiateController() throws DataAccessException {
        try {
            if(data.checkFileExistance()){
                System.out.println();
                data.deleteFile(data.getResourceRelPath());
                data.createFile(data.getResourceRelPath());
            }
        } catch (IOException exception) {
            DataAccessException ex = new DataAccessException("Exception, couldn't initiate a new controller");
            ex.throwDataAccessException();
        }
    }

    @Override
    public void listMovies() throws DataReaderException {
        try {
            int index = 1;
            for(Movie movie : data.readMovies(data.getResourceRelPath())){
                System.out.println(index +" "+movie);
                index++;
            }
        } catch (IOException exception) {
            DataReaderException ex = new DataReaderException("Exception, couldn't list movies");
            ex.throwDataReaderException();
        }
    }

    @Override
    public void addMovie(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMovie'");
    }

    @Override
    public void deleteMovie(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMovie'");
    }

    @Override
    public void searchMovie(String movieToSearch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchMovie'");
    }

}
