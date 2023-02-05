package com.kiran.Restaurant.Error;

public class ListEmptyException extends RuntimeException{
    public ListEmptyException(String message) {
        super(message);
    }
}
