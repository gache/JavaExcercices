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

    public int somme() {
        return a + b;
    }

}
