package com.eliaswalyba.m1sir.tutorials.practice1.exercise9;

public class IllegalIdentityCardNumberException extends Exception {

    public IllegalIdentityCardNumberException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalIdentityCardNumberException() {
        super("Please provide a good identity card number. An identity card number is a 13 digit numerical string");
    }

}
