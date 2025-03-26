package com.movie_lister._04_exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class DataReaderException extends DataAccessException {

    public DataReaderException(String message) {
        super(message);
    }

    public void throwDataReaderException(){
        
        try (StringWriter sw = new StringWriter()) {
            this.printStackTrace(new PrintWriter(sw));
            String stackTraceStr = sw.toString();
            throw new DataReaderException(this.getMessage()+"\n"+ stackTraceStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
