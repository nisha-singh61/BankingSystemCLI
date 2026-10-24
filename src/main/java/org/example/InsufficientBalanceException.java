package org.example;

//create a custom exception class called InsufficientBalanceException that extends RuntimeException
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
