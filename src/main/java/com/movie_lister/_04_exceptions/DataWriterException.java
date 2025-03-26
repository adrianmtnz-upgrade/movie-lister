package com.movie_lister._04_exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class DataWriterException extends DataAccessException {
    
    public DataWriterException(String message){
        super(message);
    }

    public void throwDataWriterException(){
        
        try (StringWriter sw = new StringWriter()) {
            this.printStackTrace(new PrintWriter(sw));
            String stackTraceStr = sw.toString();
            throw new DataWriterException(this.getMessage()+"\n"+ stackTraceStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
