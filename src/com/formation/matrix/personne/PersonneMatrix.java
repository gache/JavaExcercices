package com.formation.matrix.personne;

public class PersonneMatrix {
    private  String prenom;

    public PersonneMatrix(String prenom) {
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
        return "PersonneMatrix{" +
                "prenom: '" + prenom + '\'' +
                '}';
    }
}
