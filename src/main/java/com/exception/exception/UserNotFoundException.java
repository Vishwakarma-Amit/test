package com.exception.exception;

public class UserNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 9093947855016869484L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
