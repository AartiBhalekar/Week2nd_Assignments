package com.example912.demo912.exception;

public class UserNotFoundException extends RuntimeException {
	
	private static final long  serialVersionUID = 1L;
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
