package com.example.mall._core.errors.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomRestfullException extends RuntimeException {

    private HttpStatus status;

    public CustomRestfullException(String message, HttpStatus httpStatus) {
        super(message);
        this.status = httpStatus;
    }

}

