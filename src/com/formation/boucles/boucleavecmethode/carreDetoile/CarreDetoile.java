package com.formation.boucles.boucleavecmethode.carreDetoile;

import java.util.Scanner;

public class CarreDetoile {
    Scanner scanner = new Scanner(System.in);

    int numEtoile;

    public void demandeInfo() {
        System.out.println("Saisir un numero pour le Carré D'étoile: ");
        numEtoile = scanner.nextInt();
    }

    public void carre() {
        if (numEtoile > 2 && numEtoile <= 50) {
            for (int i = 1; i < numEtoile; i++) {
                for (int j = 1; j <= numEtoile; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

        } else {
            System.out.println("******  Error il faut introduire un numero entre 2 et 50 *******");
        }
    }


}
