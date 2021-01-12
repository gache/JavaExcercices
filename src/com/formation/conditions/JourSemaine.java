package com.formation.conditions;

import java.util.Scanner;

public class JourSemaine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une numero: ");
        int jour = scanner.nextInt();
        if (jour == 1) {
            System.out.println("Aujourd'hui est Lundi");
        } else if (jour == 2) {
            System.out.println("Aujourd'hui est Mardi");
        } else if (jour == 3) {
            System.out.println("Aujourd'hui est Mercredi");
        } else if (jour == 4) {
            System.out.println("Aujourd'hui est Jeudi");
        } else if (jour == 5) {
            System.out.println("Aujourd'hui est Vendredi");
        } else if (jour == 6) {
            System.out.println("Aujourd'hui est Samedi");
        } else if (jour == 7) {
            System.out.println("Aujourd'hui est Dimache");
        }else{
            System.out.println("Entrée invalide! Veuillez saisir le numéro de jour entre 1 et 7.");
        }
    }
}
