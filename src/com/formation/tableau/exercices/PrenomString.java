package com.formation.tableau.exercices;

import java.util.Scanner;

public class PrenomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrePrenom;

        do {
            System.out.println("Saisir un numero de prenom: ");
            entrePrenom = Integer.parseInt(scanner.nextLine());
        } while (entrePrenom <= 0);

        String[] prenoms = new String[entrePrenom];

        for (int i = 0; i < prenoms.length; i++) {
            System.out.println("Saisir le tableau avec le prenom numéro " + (i +1));
            prenoms[i] = scanner.nextLine();
        }
        System.out.println("Mon tableau de prenom avec la boucle forEach");

        for (String e: prenoms) {
            System.out.print("\t" + e);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Mon tableau de prenom avec la boucle for");

        for (int i = 0; i < prenoms.length; i++) {
            System.out.print("\t" + prenoms[i]);
        }
        System.out.println();
        System.out.println();
    }
}
