package com.testres.rest.dto;

/**
 * Created by callo_000 on 13.02.2016.
 */
public class ApiError {
    private String error;

    public ApiError(String message) {
        this.error = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
