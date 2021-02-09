package com.formation.poo.exercicesPoo.employee;

public class Technicien extends Operateur {

    public Technicien() {
    }

    public Technicien(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " Technicien ";
    }
}
