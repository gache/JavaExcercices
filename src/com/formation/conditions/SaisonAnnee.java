package com.formation.conditions;

import java.util.Scanner;

public class SaisonAnnee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir in numero entre 1 / 12: ");
        int mois = Integer.parseInt(scanner.nextLine());
        String saison = null;

        if (mois >= 1 && mois < 12) {
            if (mois == 12 || mois == 1 || mois == 2) {
                saison = "Hiver";
            } else if (mois == 3 || mois == 4 || mois == 5) {
                saison = "Primtemps";
            } else if (mois == 6 || mois == 7 || mois == 8) {
                saison = "Eté";
            } else if (mois == 9 || mois == 10 || mois == 11) {
                saison = "Automme";
            }else{
                saison = "Mois incorrecte";
            }
        }

        System.out.println(saison);
        
    }
}
