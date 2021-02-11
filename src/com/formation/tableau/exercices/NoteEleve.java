package com.formation.tableau.exercices;

import java.util.Scanner;

public class NoteEleve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEleves;
        double somme = 0, moyenne;
        do {
            System.out.println("Numéro d'eleves dans la class: ");
            numEleves = Integer.parseInt(scanner.nextLine());
        } while (numEleves <= 0);

        double[] notes = new double[numEleves]; // creation du tableau

        // Cette boucle met les notes saisir par clavier dans le tableau
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Eleve " + (i + 1) + " note finale");
            notes[i] = Double.parseDouble(scanner.nextLine());
        }

        // Cette boucle fait la somme des notes des eleves
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }

        // calcule de la moyenne de la class
        moyenne = somme / notes.length;

        System.out.println("La note moyenne de la class est de: " + moyenne);

        // Cette boucle montre quel eleve a plus que la moyenne de la class
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > moyenne) {
                System.out.println("Eleve " + (i + 1) + " sa note finale est plus que la moyenne de la class: " + notes[i]);
            }
        }

    }
}
