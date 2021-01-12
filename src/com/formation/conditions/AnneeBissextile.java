package com.formation.conditions;

import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fournir les données d'entrée
        System.out.print("Saisir une année : ");
        int annee = scanner.nextInt();

        if (((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
            System.out.println(annee + " est une année bissextile");
        } else {
            System.out.println("Année simple");
        }

        // fermer les ressources
        scanner.close();
    }
}
