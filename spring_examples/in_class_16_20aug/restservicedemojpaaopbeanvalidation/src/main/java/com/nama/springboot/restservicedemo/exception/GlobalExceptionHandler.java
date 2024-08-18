package com.nama.springboot.restservicedemo.exception;

import com.nama.springboot.restservicedemo.model.Emp;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    @Override //it's a overriden method
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        //return this.handleExceptionInternal(ex, (Object)null, headers, status, request);
        Map<String,Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("msg",ex.getBindingResult().toString());

         return new ResponseEntity<>(body,HttpStatus.BAD_REQUEST);
    }


}
