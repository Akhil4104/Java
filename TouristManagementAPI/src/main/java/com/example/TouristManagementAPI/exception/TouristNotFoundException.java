package com.example.TouristManagementAPI.exception;

public class TouristNotFoundException extends RuntimeException{
    public TouristNotFoundException(String message){
        super(message);
    }
}
