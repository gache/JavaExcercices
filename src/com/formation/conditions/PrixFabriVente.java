package com.formation.conditions;

import java.util.Scanner;

public class PrixFabriVente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultat;
        System.out.println("Saisir le pri de fabrication");
        int prixFabri = scanner.nextInt();

        System.out.println("Saisir le prix de vente");
        int prixVente = scanner.nextInt();

        if (prixFabri > prixVente) {
            resultat = prixFabri - prixVente;
            System.out.println("Perte de " + resultat);
        } else if (prixVente > prixFabri) {
            resultat = prixVente - prixFabri;
            System.out.println("Benefice de " + resultat);
        } else {
            resultat = 0;
            System.out.println("Pas de benefice et pas de perte " + resultat);
        }
    }
}
