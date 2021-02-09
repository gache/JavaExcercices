package com.formation.poo.exercicesPoo.employee;

public class Cadre extends Employee {

    public Cadre() {
    }

    public Cadre(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " Cadre ";
    }
}
