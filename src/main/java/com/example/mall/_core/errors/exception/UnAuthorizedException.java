package com.example.mall._core.errors.exception;

import org.springframework.http.HttpStatus;

public class UnAuthorizedException extends RuntimeException {

	private HttpStatus status;
	
	public UnAuthorizedException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
}

