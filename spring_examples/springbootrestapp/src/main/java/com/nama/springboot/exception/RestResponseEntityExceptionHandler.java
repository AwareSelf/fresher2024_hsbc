package com.nama.springboot.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {

	  @ExceptionHandler(EmpNotFoundException.class)
	    public ResponseEntity<Object> handleCityNotFoundException(
	            EmpNotFoundException ex, WebRequest request) {

	        Map<String, Object> body = new LinkedHashMap<>();
	        body.put("timestamp", LocalDateTime.now());
	        body.put("message", ex.getMessage());

	        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	    }



	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
																  HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(), "Validation Failed",
				ex.getBindingResult().toString());
		return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
	}
}


//above methods written below in slightly diff way, use whichever suits you
  /*
	    @ExceptionHandler(NoDataFoundException.class)
	    public ResponseEntity<Object> handleNodataFoundException(
	            NoDataFoundException ex, WebRequest request) {

	        Map<String, Object> body = new LinkedHashMap<>();
	        body.put("timestamp", LocalDateTime.now());
	        body.put("message", "No cities found");

	        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	    }

	    @Override
	    public ResponseEntity<Object> handleMethodArgumentNotValid(
	            MethodArgumentNotValidException ex, HttpHeaders headers,
	            HttpStatusCode status, WebRequest request) {

	        Map<String, Object> body = new LinkedHashMap<>();
	        body.put("timestamp", LocalDate.now());
	        body.put("status", status.value());

	        List<String> errors = ex.getBindingResult()
	                .getFieldErrors()
	                .stream()
	                .map(DefaultMessageSourceResolvable::getDefaultMessage)
	                .collect(Collectors.toList());

	        body.put("errors", errors);

	        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	    }
	    */
	  