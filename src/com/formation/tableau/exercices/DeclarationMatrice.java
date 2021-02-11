package com.formation.tableau.exercices;

import java.util.Arrays;

public class DeclarationMatrice {
    public static void main(String[] args) {

        int[][] ventes = new int[4][6]; // [] fait réference au nombre de ligne et deuxième [] fait réference au nombre de colonne
        double[][] temperature = new double[3][4];

        System.out.println("Matrice de 4 x 6 ");
        for (int[] ve : ventes) {
            System.out.println("\t" + Arrays.toString(ve));

        }

        System.out.println();
        System.out.println("Matrice de 3 x 4 ");
        for (double[] tem : temperature) {
            System.out.println("\t" + Arrays.toString(tem));
        }


        // on peut créer de matrice Irrégulier
        // par contre on est obligé d'indique le nombre de ligne
        int[][] m = new int[3][]; // j'ai créé une matrice de trois lignes
        // après  à chaque ligne on peut l'affecter le nombre de colonne
        m[0] = new int[3]; // affectation du numéro de colonne de la matrice
        m[1] = new int[5]; // affectation du numéro de colonne de la matrice
        m[2] = new int[2]; // affectation du numéro de colonne de la matrice

        m[0][0] = 15;
        m[1][4] = 20;
        m[2][1] = 50;
        System.out.println();
        System.out.println("Matrice Irrégulier");
        for (int[] ints : m) {
            System.out.println("\t" + Arrays.toString(ints)); // affiche la matrice avec ses valaur par defaut et le valaleur qu'on vient d'ajouter
        }

        System.out.println();
        System.out.println("Autre façon d'écrire une matrice");
        int[][] numeros = {{6, 7, 5}, {3, 8, 4}, {1, 0, 2}, {9, 5, 2}};
        for (int[] n : numeros) {
            System.out.println("\t" + Arrays.toString(n));
        }
        System.out.println();
        System.out.println("Autre façon d'écrire une matrice Irrégulier");
        int[][] matriceIrregulaire = {{6, 7, 5, 0, 4}, {3, 8, 4}, {1, 0, 2, 7}, {9, 5}};

        for (int[] mI : matriceIrregulaire) {
            System.out.println("\t" + Arrays.toString(mI));
        }

    }
}
