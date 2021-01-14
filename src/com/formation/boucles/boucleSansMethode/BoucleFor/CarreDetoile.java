package com.formation.boucles.boucleSansMethode.BoucleFor;

import java.util.Scanner;

public class CarreDetoile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int etoile = scanner.nextInt();
        System.out.println("------- un carré d'étoiles -------");

        if (etoile >= 2 && etoile <= 50) {
            for (int i = 1; i < etoile; i++) {
                for (int j = 1; j < etoile; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("******  Error il faut introduire un numero entre 2 et 50 *******");
        }

    }
}
