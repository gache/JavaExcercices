package com.formation.classEtObjets.constructor;

public class Arithmetique {
    int a;
    int b;

    public Arithmetique() {
    }

    public Arithmetique(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // methode de la somme
    public int somme() {
        return a + b;
    }

    // Methode de la sustraction
    public int sustraction() {
        return a - b;
    }

    // Methode de la multiplication
    public int multi() {
        return a * b;
    }

    // Methode de la division
    public int division() {
        return a / b;
    }

}
