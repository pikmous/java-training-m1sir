package com.eliaswalyba.m1sir.tutorials.practice1.exercise5;

import java.util.Scanner;

public class TestFactorial {

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        boolean pass = false;
        int n = 0;
        while(!pass) {
            System.out.print("> n = ");
            n = scanner.nextInt();
            if (n >= 0 && n <= 20) pass = true;
        }
        Factorial f = new Factorial(n);
        System.out.print(String.format("%d! = %d", n, f.compute()));
    }

}
