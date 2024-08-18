package com.nama.springboot.restservicedemo.exception;

import com.nama.springboot.restservicedemo.model.Emp;

public class EmployeeAlreadyExists extends Exception {

    public EmployeeAlreadyExists(String message)
    {
        super(message);
    }
}
