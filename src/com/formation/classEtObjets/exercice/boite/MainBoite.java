package com.formation.classEtObjets.exercice.boite;

public class MainBoite {
    public static void main(String[] args) {

        Boite boite = new Boite(3, 2, 6);
        int resultat = boite.calcuelBoite();
        System.out.println("Le volumen de la Boite est: " + resultat);

        Boite boite2 = new Boite();
        boite2.largeur = 5;
        boite2.hauteur = 6;
        boite2.profond = 8;
        System.out.println("Le volumen de la Boite est: " + boite2.calcuelBoite());

    }
}
