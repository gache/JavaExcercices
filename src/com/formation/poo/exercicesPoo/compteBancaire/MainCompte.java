package com.formation.poo.exercicesPoo.compteBancaire;

public class MainCompte {
    public static void main(String[] args) {
        Compte compte = new Compte( 5000.0);
        compte.deposer( 2000.0);
        compte.retirer(1000.0);
        compte.afficher();
    }
}
