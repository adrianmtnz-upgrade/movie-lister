package com.movie_lister._04_exceptions;

public class DataWriterException extends DataAccessException {
    public DataWriterException(String message){
        super(message);
        message = "Exception on data writing";
    }
}
