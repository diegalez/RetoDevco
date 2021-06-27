package com.devco.utils;

public enum ErrorMessage {

    MESSAGE("the elements are not the same");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

