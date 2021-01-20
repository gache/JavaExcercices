package com.formation.classEtObjets.motStatic;

public class PersonneMotStatic {
    private String prenom;
    private int idPersonne;
    private static int compteurPersonne;


    public PersonneMotStatic(String prenom) {
        this.prenom = prenom;
        compteurPersonne++;
        this.idPersonne = compteurPersonne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public static int getCompteurPersonne() {
        return compteurPersonne;
    }

    @Override
    public String toString() {
        return " prenom: '" + prenom + '\'' +
                ", idPersonne: " + idPersonne;
    }
}
