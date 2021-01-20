package com.formation.poo.heritage.exercice.surchargeMethode;

public class Operation {
    public static int somme(int a, int b) {
        System.out.println("Methode somme: (int, int)");
        return a + b;
    }

    public static double somme(double a, double b) {
        System.out.println("Methode somme: (double, double)");
        return a + b;
    }

    public static double somme(int a, double b) {
        System.out.println("Methode somme: (int, double)");
        return a + b;
    }

    public static double somme(double a, int b) {
        System.out.println("Methode somme: (double, int)");
        return a + b;
    }
}
