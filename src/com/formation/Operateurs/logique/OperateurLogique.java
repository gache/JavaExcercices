package com.formation.Operateurs.logique;

public class OperateurLogique {
    public static void main(String[] args) {

        int a = 5;
        int valMin = 0, valMax = 10;
        // L'operateur && et Son résultat est true uniquement si les deux valeurs auxquelles il s'applique valent true.
        // Table
        // (true && true);   // true
        // (true && false);  // false
        // (false && true);  // false
        // (false && false); // false
        if (a >= valMin && a <= valMax) {
            System.out.println("On est dans le rang");
        } else {
            System.out.println("On n'est pas dans le rang");
        }


        // L'opérateur || (OU logique) Son résultat est  true si au moins une des deux valeurs auxquelles il s'applique vaut true.
        // Table
        // (true || true);   // true
        // (true || false);  // true
        // (false || true);  // true
        // (false || false); // false
        boolean vacances = false;
        boolean jourrepo = false;
        if (vacances || jourrepo) {
            System.out.println("Le père peut assiter au jeu de son enfant");
        } else {
            System.out.println("Le père ne peut pas assiter au jeu de son enfant");
        }

    }
}
