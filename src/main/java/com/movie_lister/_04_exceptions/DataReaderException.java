package com.movie_lister._04_exceptions;

public class DataReaderException extends DataAccessException {
    public DataReaderException(String message) {
        super(message);
        message = "Exception on reading data";
    }
}
