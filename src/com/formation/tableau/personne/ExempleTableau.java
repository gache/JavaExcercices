package com.formation.tableau.personne;

import com.formation.tableau.personne.Personne;

public class ExempleTableau {
    public static void main(String[] args) {
        // Declarion de mon tableau de type int
        // Avec le tableau de type primitif si je ne donne pas de valeur à une index de mon tableau sa valeur par default est 0
        int[] ages;

        // instance de mon tableau
        ages = new int[3];

        // Initialisation de mon tablau avec de valeur
        ages[0] = 30;
        ages[1] = 15;
        ages[2] = 20;

        System.out.println("Sans boucle:");
        System.out.println("Tableau index 0: " + ages[0]);
        System.out.println("Tableau index 1: " + ages[1]);
        System.out.println("Tableau index 2: " + ages[2]);
        System.out.println();

        System.out.println("Boucle for:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(i + ": " + ages[i]);
        }
        // Declarion de mon tableau de type object
        Personne[] personnes;
        // instance de mon tableau je lui donne sa taille
        personnes = new Personne[4];

        // Initialisation de mon tableau avec de valeur
        // Avec le tableau de type object si je ne donne pas de valeur à une index de mon tableau sa valeur par default est null
        personnes[0] = new Personne("Juan");
        personnes[1] = new Personne("Maria");
        personnes[2] = new Personne("Carmen");

        System.out.println("*********Sans boucle:**********");
        System.out.println("Tableau index 0: " + personnes[0]);
        System.out.println("Tableau index 1: " + personnes[1]);
        System.out.println("Tableau index 2: " + personnes[2]);
        System.out.println();

        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }


    }
}
