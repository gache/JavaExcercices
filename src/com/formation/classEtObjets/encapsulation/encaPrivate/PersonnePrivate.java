package com.formation.classEtObjets.encapsulation.encaPrivate;

public class PersonnePrivate {

    // attribut privée
    private String prenom;
    private String nom;
    boolean effacer;

    public PersonnePrivate() {
    }

    public PersonnePrivate(String prenom, String nom, boolean effacer) {
        this.prenom = prenom;
        this.nom = nom;
        this.effacer = effacer;
    }

    // Méthode publique pour acceder à l'attribut prenom
    public String getPrenom() {
        return this.prenom;
    }

    // Méthode publique pour modifier à l'attribut prenom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEffacer() {
        return effacer;
    }

    public void setEffacer(boolean effacer) {
        this.effacer = effacer;
    }

    @Override
    public String toString() {
        return "prenom ='" + prenom + '\'' +
                ", nom ='" + nom + '\'' +
                ", effacer =" + effacer;
    }


}

