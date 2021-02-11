package com.formation.tableau.exercices;


public class TabNum {
    public static void main(String[] args) {
        int m = 5;
        int[] a = new int[5];

        a[1] = 2; // on peut utiliser un valeur de type entier
        a[2] = a[1]; //
        a[0] = a[1] + a[2] + 2; // on peut faire des operations arithmetique
        a[0]++; // on peut faire l'incrementation ou décrementation
        a[3] = m + 10; // on peut utiliser une variable de type entier

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();


    }
}