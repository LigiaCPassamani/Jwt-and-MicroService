package com.blog.blog.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NullPointerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NullPointerException(String token, String message) {
        super(String.format("Failed for [%s]: %s", token, message));
    }
}
