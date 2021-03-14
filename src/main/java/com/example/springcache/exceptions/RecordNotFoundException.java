package com.example.springcache.exceptions;

public class RecordNotFoundException extends Exception{
    public static final int Error_CODE=1000;

    public RecordNotFoundException(String message)
    {
        super(message);
    }
}
