package com.formation.conditions;

import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Le numéro est Pair");
        } else {
            System.out.println("Le numéro est Impair");
        }

        scanner.close();
    }
}
