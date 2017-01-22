package com.eliaswalyba.m1sir.tutorials.practice1.exercise4;

import java.util.Scanner;

public class TestEquationDegre2 {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("> Resolveur d'equations du second degres");
        while (true) {
            System.out.print("> a = ");
            double a = scanner.nextInt();
            System.out.print("> b = ");
            double b = scanner.nextInt();
            System.out.print("> c = ");
            double c = scanner.nextInt();

            EquationDegre2 e = new EquationDegre2(a, b, c);
            if(e.delta() == 0) {
                double s = -e.getB() / (2*e.getA());
                System.out.println(String.format("> S = {%2f}", s));
            } else if (e.delta() > 0) {
                double s1 = (-e.getB() - Math.sqrt(e.delta())) / (2*a);
                double s2 = (-e.getB() + Math.sqrt(e.delta())) / (2*a);
                System.out.println(String.format("> S = {%2f ; %2f}", s1, s2));
            } else {
                double re = -e.getB() / (2*a);
                double im = Math.abs(e.delta()) / (2*a);
                System.out.println(String.format("> S = {%2f + i%2f ; %2f - i%2f}", re, im, re, im));
            }
            System.out.println("-------------------------------------------------------");
        }
    }

}