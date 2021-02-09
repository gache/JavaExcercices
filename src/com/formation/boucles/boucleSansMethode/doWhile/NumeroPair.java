package com.formation.boucles.boucleSansMethode.doWhile;

import java.util.Scanner;

public class NumeroPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Saisir numero 1:");
            a = Integer.parseInt(scanner.nextLine());

            System.out.println("Saisir numero 2:");
            b = Integer.parseInt(scanner.nextLine());

            if (a >= b) {
                System.out.println("Saisir autre numero car le deuxième doit être supérieur");
            }
        } while (a >= b);

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
