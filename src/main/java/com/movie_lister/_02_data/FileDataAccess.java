package com.movie_lister._02_data;

import java.util.List;
import java.io.*;

import com.movie_lister._01_objects.Movie;
import com.movie_lister._04_exceptions.*;

public class FileDataAccess implements DataAccessible {
    public String resourceRelPath = "src/main/resources/movies.txt";
    
    

    @Override
    public boolean checkFileExistance() {
        File file = new File(resourceRelPath);
        return file.exists();
    }

    @Override
    public void createFile(String resourceRelPath) throws DataAccessException {
        try {
            File file = new File(resourceRelPath);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.println("File created successfully");
            out.close();
        } catch (IOException exception) {
            DataAccessException ex = new DataAccessException( "Exception, file couldn't be created");
            ex.throwDataAccessException();
        }
    }

    @Override
    public void deleteFile(String resourceRelPath) throws DataAccessException{
        File file = new File(resourceRelPath);
        try {
            if (!file.delete()) throw new DataAccessException("File not found or deletion failed");
        }catch (IOException exception) {
            DataAccessException ex = new DataAccessException("Exception, couldn't delete the file");
            ex.throwDataAccessException();
        }
    }

    @Override
    public void writeMovie(Movie movie, String resourceRelPath, boolean append) throws DataWriterException {
        File file = new File(resourceRelPath);
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file));
            out.println(movie.toString());
            out.close();
        } catch (IOException exception) {
            DataWriterException ex = new DataWriterException("Exception, couldn't add the movie to file");
            ex.throwDataAccessException();
        }
    }

    @Override
    public List<Movie> readMovies(String resourceRelPath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readMovies'");
    }

    @Override
    public String searchMovies(String resourceRelPath, String movieToSearch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchMovies'");
    }

}
