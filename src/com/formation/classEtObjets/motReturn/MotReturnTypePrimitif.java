package com.formation.classEtObjets.motReturn;

public class MotReturnTypePrimitif {

    public static void main(String[] args) {
        int resultat = suma(3, 6);
        System.out.println("resultat = " + resultat);
    }

    public static int suma(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Saisir un numero different de zéro. ");
            return 0;
        }
        return a + b;
    }
}
