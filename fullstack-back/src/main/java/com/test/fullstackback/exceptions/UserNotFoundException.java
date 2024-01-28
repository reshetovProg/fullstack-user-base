package com.test.fullstackback.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Couldn't found the user with id "+id);
    }
}
