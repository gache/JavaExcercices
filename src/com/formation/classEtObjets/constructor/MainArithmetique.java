package com.formation.classEtObjets.constructor;

public class MainArithmetique {
    public static void main(String[] args) {
        Arithmetique arithmetique = new Arithmetique();
        arithmetique.a = 5;
        arithmetique.b = 3;
        int result = arithmetique.somme();
        System.out.println("result = " + result);

        Arithmetique arithmetique2 = new Arithmetique(2,4);
        System.out.println("arithmetique 2 = " + arithmetique2.somme());
    }
}
