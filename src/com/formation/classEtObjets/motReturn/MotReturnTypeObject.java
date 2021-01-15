package com.formation.classEtObjets.motReturn;

public class MotReturnTypeObject {

    public static void main(String[] args) {

        Somme somme = creerSomme();
        int resultat = somme.a + somme.b;
        System.out.println("resultat = " + resultat);

    }

    public static Somme creerSomme() {
        Somme somme1 = new Somme(3, 4);
        if (somme1.a == 0 && somme1.b == 0) {
            System.out.println("Saisir un numero different de zéro. ");
            return somme1;
        }
        return somme1;
    }

}

class Somme {
    int a;
    int b;

    public Somme(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
