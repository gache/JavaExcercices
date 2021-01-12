package com.formation.variables.affectation;

public class Variable3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 5;
        b = 7;
        a = b;
        b = a;

        System.out.println("Le resultat de a:" + a + " b: " + b);
    }
}
