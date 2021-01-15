package com.formation.classEtObjets.constructor;

public class MainArithmetique {
    public static void main(String[] args) {
        // Création d'un l'objet de la class Arithmetique
//        Arithmetique arithmetique = new Arithmetique();
//        arithmetique.a = 5;
//        arithmetique.b = 3;
//        int result = arithmetique.somme();
//        System.out.println("arithmetique 1 = " + result);
//
//        Arithmetique arithmetique2 = new Arithmetique(2, 4);
//        System.out.println("arithmetique 2 = " + arithmetique2.somme());

        // Pour explique la porte des variable.

        // Variables locale
        int operationA = 6;
        int operationB = 2;

        // Création d'un l'objet de la class Arithmetique
        Arithmetique arithmetique3 = new Arithmetique(operationA, operationB);

        // impression des variables operation
        System.out.println("operationA = " + operationA);
        System.out.println("operationB = " + operationB);
        
        // impresion de la methode somme 
        System.out.println("arithmetique 3  somme= " + arithmetique3.somme());
        // impresion de la methode sustraction
        System.out.println("arithmetique 3  sustraction = " + arithmetique3.sustraction());
        // impresion de la methode multiplication
        System.out.println("arithmetique 3  multiplication= " + arithmetique3.multi());
        // impresion de la methode division
        System.out.println("arithmetique 3  division = " + arithmetique3.division());
    }
}
