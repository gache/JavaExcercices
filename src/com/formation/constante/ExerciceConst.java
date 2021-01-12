package com.formation.constante;


public class ExerciceConst {
    private final String prenom;
    private String nom;

    public ExerciceConst(String prenom) {
        this.prenom = prenom;
        this.nom = "Franco";
    }

    public String getNomComplet() {
        return "Le prenom est " + prenom + " et so nom est famille est " + nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
