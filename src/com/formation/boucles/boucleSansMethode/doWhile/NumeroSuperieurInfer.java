package com.formation.boucles.boucleSansMethode.doWhile;

import java.util.Scanner;

public class NumeroSuperieurInfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, superieur, inferieur;

        do {
            System.out.println("Saisir numero 1:");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Saisir numero 2:");
            num2 = Integer.parseInt(scanner.nextLine());
            if (num1 == num2) {
                System.out.println("Les numeros ne doivent pas être égale");
            }
        } while (num1 == num2);

        if (num1 > num2) {
            superieur = num1;
            inferieur = num2;
        } else {
            superieur = num2;
            inferieur = num1;
        }

        for (int j = inferieur; j <= superieur; j++) {
            System.out.print(j + "\t");
        }

    }
}
