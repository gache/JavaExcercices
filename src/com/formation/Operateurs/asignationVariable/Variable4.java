package com.formation.Operateurs.asignationVariable;

public class Variable4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;

        a = 5;
        b = 7;
        b = a;
        a = b;
        c +=3;

        System.out.println("Le resultat de a:" + a + " b: " + b);
        System.out.println("c = " + c);
    }
}
