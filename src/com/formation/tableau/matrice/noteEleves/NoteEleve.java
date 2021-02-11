package com.formation.tableau.matrice.noteEleves;

import java.util.Scanner;

public class NoteEleve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEleve, noteEleve;


        do {
            System.out.println("Saisir la taille du tableau Eleves: ");
            numEleve = Integer.parseInt(scanner.nextLine());
            System.out.println("Saisir la taille du tableau notes: ");
            noteEleve = Integer.parseInt(scanner.nextLine());
        } while (noteEleve <= 0 && numEleve <= 0);

        int[][] eleves = new int[numEleve][noteEleve];

        for (int i = 0; i < numEleve; i++) {
            for (int j = 0; j < noteEleve; j++) {
                System.out.println("Saisir la note numéro " + (j + 1) + " pour l'etudiant numéro " + (i + 1) + ":");
                eleves[i][j] = scanner.nextInt();
            }
        }
        System.out.print("tableau des étudiants\n");
        for (int i = 0; i < eleves.length; i++) {
            for (int j = 0; j < eleves[i].length; j++) {
                System.out.print("\t" + eleves[i][j]);
            }
            System.out.println();
        }


    }
}
