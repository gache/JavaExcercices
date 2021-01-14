package com.formation.classEtObjets;

public class MainPersonne {
    public static void main(String[] args) {
        // Creéation des objets
        Personne personne = new Personne();
        Personne personne2 = new Personne();


        personne.prenom = "Erick";
        personne.nom = "Franco";


        personne2.prenom = "Maud";
        personne2.nom = "Franzetti";
        // j'appel ma methode
        System.out.println("Objet 1 ");
        personne.voirNom();
        System.out.println();
        System.out.println("Objet 2 ");
        personne2.voirNom();


    }
}
