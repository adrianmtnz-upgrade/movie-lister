package com.movie_lister._02_data;

import java.util.List;
import java.io.*;

import com.movie_lister._01_objects.Movie;
import com.movie_lister._04_exceptions.DataAccessException;

public class FileDataAccess implements DataAccessible {
    public String resourceRelPath = "src/main/resources/movies.txt";
    File file = new File(resourceRelPath);
    

    @Override
    public boolean checkFileExistance() {
        return file.exists();
    }

    @Override
    public void createFile(String resourceRelPath) throws DataAccessException {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.println("File created successfully");
            out.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            throw new DataAccessException("Failed while creating file: "+exception.getMessage());
        }
    }

    @Override
    public void deleteFile(String resourceRelPath) throws DataAccessException{
        file = new File(resourceRelPath);
        try {
            if (!file.delete()) throw new DataAccessException("File not found or deletion failed");
        }catch (Exception exception) {
                StringWriter sw = new StringWriter();
                exception.printStackTrace(new PrintWriter(sw));
                String stackTraceStr = sw.toString();
                throw new DataAccessException("Couldn't delete the file\n" + stackTraceStr);
            }
    }

    @Override
    public void writeMovie(Movie movie, String resourceRelPath, boolean append) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeMovie'");
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
