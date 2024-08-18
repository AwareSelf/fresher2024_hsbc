package com.nama.springboot.restservicedemo.exception;

public class EmployeeNotFound extends Exception {

    public EmployeeNotFound(String message)
    {
        super(message);
    }
}
