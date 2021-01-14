package com.formation.classEtObjets.methode;

public class MainArithmetique {
    public static void main(String[] args) {

        Arithmetique arithmetique = new Arithmetique();
        int resultSomme = arithmetique.somme(56,96);
        int resultMulti = arithmetique.multi(85,96);

        System.out.println("********* Avec Return *********");
        System.out.println("resultat = " + resultSomme);
        System.out.println("resultMulti = " + resultMulti);

        System.out.println();
        System.out.println();
        arithmetique.messageConsole();
        arithmetique.reste();
        arithmetique.divisition();
        System.out.println("********* Sans Return *********");
        arithmetique.resultat();



    }
}
