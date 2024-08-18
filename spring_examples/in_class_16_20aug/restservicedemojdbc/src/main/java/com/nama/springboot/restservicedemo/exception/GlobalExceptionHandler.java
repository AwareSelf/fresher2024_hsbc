package com.nama.springboot.restservicedemo.exception;

import com.nama.springboot.restservicedemo.model.Emp;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

//Spring 3.2 brought support for Global ExceptionHandler
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeAlreadyExists.class)
    public ResponseEntity<Object> handleEmpAlreadyExists(EmployeeAlreadyExists ex, WebRequest wr)
    {
        Map<String,Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("msg",ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.FOUND);
    }
}
