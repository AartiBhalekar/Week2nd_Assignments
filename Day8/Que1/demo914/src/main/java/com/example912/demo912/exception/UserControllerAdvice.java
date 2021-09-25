package com.example912.demo912.exception;

import java.util.Date;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String> resourceNotFoundException(UserNotFoundException ex, WebRequest res){
		return new ResponseEntity<String>("User not Found", HttpStatus.NOT_FOUND);
	}
	
	
	
	
	/* public <ErrorMessage> ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException ex, WebRequest res) {
		
		ErrorMessage message = new ErrorMessage(
				HttpStatus.NOT_FOUND.value(),
				new Date(),
				request.getDescription(false));
		
		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
       // return new ResponseEntity<ErrorMessage>("User is invalid "+ex, HttpStatus.NOT_FOUND);
      }*/

}
