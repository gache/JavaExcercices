package com.formation.poo.heritage.exercice.surchargeMethode;

public class MainOperation {
    public static void main(String[] args) {
        System.out.println("Resultat 1 = " + Operation.somme(3,4));
        System.out.println();
        System.out.println("Resultat 2 = " + Operation.somme(5, 4.1));
        System.out.println();
        System.out.println("Resultat 3 = " + Operation.somme(7.1, 6));
        System.out.println();
        System.out.println("Resultat 4 = " + Operation.somme(3, 4L));
        System.out.println();
        System.out.println("Resultat 5 = " + Operation.somme(5F, 'A'));
    }
}
