package com.formation.poo.exercicesPoo.compteBancaire;

public class Compte {
    public Double solde;


    public Compte(Double solde) {
        this.solde = solde;
    }

    public void deposer(Double deposer) {
        this.solde += deposer;
    }

    public void retirer(Double retirer) {
        this.solde -= retirer;
    }

    public void afficher() {
        System.out.println("Le nouveau solde de votre compte est: " + solde + " €");
    }


}
