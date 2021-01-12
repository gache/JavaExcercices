package com.formation.conditions;

import java.util.Scanner;

public class LesMois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une numero du mois (1-12): ");
        int mois = scanner.nextInt();

        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            System.out.println("C'est un mois de 31 jour");
        } else if (mois == 2) {
            System.out.println("le mois de fevrier a entre 28 ou 29 jour");
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            System.out.println("C'est un mois de 30 jour");
        } else {
            System.out.println("Entrée invalide! Veuillez saisir le numéro du mois entre (1-12). ");
        }
    }
}
