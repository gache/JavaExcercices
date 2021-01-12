package com.formation.poo.exercicesPoo.voiture;

public class MainVoiture {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.setMarque("Audi");
        voiture.setPrix((double) 15000);
        voiture.afficher();
    }
}
