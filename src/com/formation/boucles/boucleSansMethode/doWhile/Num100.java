package com.formation.boucles.boucleSansMethode.doWhile;

import java.util.Scanner;

public class Num100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero entre 1 jusqu'à 100: ");
        int num = Integer.parseInt(scanner.nextLine());

        int i = 1;
        if (num > 0 && num <= 100) {
            do {
                System.out.println(i);
                i++;
            } while (i <= num);
        } else {
            System.out.println("Veuillez de saisir un numero entre 1 et 100 ");
        }
    }
}
