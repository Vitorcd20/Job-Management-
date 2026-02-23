package com.vitorcd20.job_management.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException() {
        super("User already exists");
    }
}
