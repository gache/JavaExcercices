package com.formation.matrix.personne;

public class MainMatrix {
    public static void main(String[] args) {

        long[][] agesPersonne;
        agesPersonne = new long[3][2];

        agesPersonne[0][0] = 30;
        agesPersonne[0][1] = 15;
        agesPersonne[1][0] = 20;
        agesPersonne[1][1] = 45;
        agesPersonne[2][0] = 5;
        agesPersonne[2][1] = 38;

        for (int i = 0; i < agesPersonne.length; i++) {
            for (int j = 0; j < agesPersonne[i].length; j++) {
                System.out.print("|" + agesPersonne[i][j] + "|");
            }
            System.out.println();
        }

        PersonneMatrix personneMatrix[][] = new PersonneMatrix[2][2];
        personneMatrix[0][0] = new PersonneMatrix("Juan");
        personneMatrix[0][1] = new PersonneMatrix("Karla");


        for (int i = 0; i < personneMatrix.length; i++) {
            for (int j = 0; j < personneMatrix[i].length; j++) {
                System.out.println(personneMatrix[i][j]);
            }
        }

    }
}
