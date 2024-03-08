package com.employeecontrol.demo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String  s) {
        super(s);
    }
}
