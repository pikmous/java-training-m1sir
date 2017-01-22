package com.eliaswalyba.m1sir.tutorials.practice1.exercise3;

public class ValidHarmonicDegreException extends Exception {
    public ValidHarmonicDegreException() {
        System.out.print("Error: a harmonic series degree can't be less than 1");
    }
    public ValidHarmonicDegreException(String errorMessage) {
        System.out.print(errorMessage);
    }
}
