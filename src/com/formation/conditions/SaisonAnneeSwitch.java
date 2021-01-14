package com.formation.conditions;

import java.util.Scanner;

public class SaisonAnneeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir in numero entre 1 / 12: ");
        int mois = Integer.parseInt(scanner.nextLine());
        String saison = null;

        switch (mois) {
            case 1:
            case 2:
            case 12:
                saison = "Hiver";
                break;

            case 3:
            case 4:
            case 5:
                saison = "Primtemps";
                break;

            case 6:
            case 7:
            case 8:
                saison = "Eté";
                break;

            case 9:
            case 10:
            case 11:
                saison = "Automme";
                break;

            default:
                saison = "Mois incorrecte";
                break;

        }
        System.out.println("saison = " + saison);
    }
}
