package com.eliaswalyba.m1sir.tutorials.practice1.exercise3;

import java.util.Scanner;

public class TestHarmonic {

    public static void main(String []args) {

        int testCounter = 5, n = 0;
        boolean pass = false;
        Scanner scanner = new Scanner(System.in);

        while (testCounter != 0 && !pass) {
            System.out.println(String.format("> Donnez la valeur de n (%d essai restant)", testCounter)); System.out.print("> ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 100) {
                System.out.println(String.format("> Vous avez demander a calculer la somme des 1/i pour i allant de 1 a %d", n));
                pass = true;
            } else testCounter--;
        }
        if (testCounter == 0) {
            System.out.print("> Au revoir..."); System.exit(0);
        }
        Harmonic h = new Harmonic(n);
        System.out.print("> S = " + h.compute());
    }

}
