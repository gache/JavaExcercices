package com.formation.variables.affectation;

public class Variable4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 5;
        b = 7;
        b = a;
        a = b;

        System.out.println("Le resultat de a:" + a + " b: " + b);
    }
}
