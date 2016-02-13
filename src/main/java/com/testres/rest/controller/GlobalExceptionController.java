package com.testres.rest.controller;

import com.testres.rest.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by callo_000 on 13.02.2016.
 */
@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleAllException(Exception ex) {
        ApiError apiError = new ApiError(ex.getClass().getName());
        return new ResponseEntity<>(apiError, null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
