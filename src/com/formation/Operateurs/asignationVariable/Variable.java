package com.formation.Operateurs.asignationVariable;

public class Variable {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 5;
        b = 3;
        c = a + b;
        a = 2;
        c = b - a;

        System.out.println("Le resultat de a:" + a + " b: " + b + " c " + c);


    }
}