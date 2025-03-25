package com.movie_lister._04_exceptions;

import java.io.IOException;

public class DataAccessException extends IOException {
    
    public DataAccessException(String message) {
        super(message);
        message = "Exception on accessing to data";
    }
}
