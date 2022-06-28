package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExceptionPresent extends RuntimeException {
    public UserNotFoundExceptionPresent(String message) {
        super(message);
    }
}
