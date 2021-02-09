package com.formation.Operateurs.logique;

public class OperateurLogique2 {
    public static void main(String[] args) {
        boolean X = true;
        boolean Y = false;
        boolean Z = true;

        if ((X && Y) || (X && Z)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if ((X || !Y) && (!X || Z)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (X || Y && Z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (!(X || Y) && Z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (X || Y || X && !Z && !Y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (!X || !Y || Z && X && !Y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
