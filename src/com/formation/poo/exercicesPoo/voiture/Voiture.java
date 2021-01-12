package com.formation.poo.exercicesPoo.voiture;

public class Voiture {
    public String marque;
    public Double prix;

    public Voiture() {
    }
    // création des getter et setter
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }


    public void afficher() {
        System.out.println("La marque de la voiture est: " + getMarque() + " et son prix de: " + getPrix());
    }

}
