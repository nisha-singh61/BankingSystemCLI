package org.example;

//create a custom exception class called AccountNotFoundException that extends RuntimeException
public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
