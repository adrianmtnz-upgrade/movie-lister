package com.movie_lister._04_exceptions;

import java.io.*;

public class DataAccessException extends IOException {

    public DataAccessException(String message) {
        super(message);
    }

    public void throwDataAccessException(){
        
        try (StringWriter sw = new StringWriter()) {
            this.printStackTrace(new PrintWriter(sw));
            String stackTraceStr = sw.toString();
            throw new DataAccessException(this.getMessage()+"\n"+ stackTraceStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
