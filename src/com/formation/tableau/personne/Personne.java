package com.formation.tableau.personne;

public class Personne {
    private  String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                " prenom:'" + prenom + '\'' +
                '}';
    }
}
