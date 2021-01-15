package com.formation.classEtObjets.exercice;

public class Boite {

    int largeur;
    int hauteur;
    int profond;

    public Boite() {
    }

    public Boite(int largeur, int hauteur, int profond) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.profond = profond;
    }

    public int calcuelBoite() {
        int volumen = largeur * hauteur * profond;
        return volumen;
    }
}
