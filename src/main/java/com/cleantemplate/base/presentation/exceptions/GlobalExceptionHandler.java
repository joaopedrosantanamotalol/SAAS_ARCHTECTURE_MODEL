package com.cleantemplate.base.presentation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cleantemplate.base.presentation.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
   @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(
        RuntimeException exception
    ) {
        ErrorResponse erro = new ErrorResponse(
            exception.getMessage()
        );

        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(erro);
    }
}
