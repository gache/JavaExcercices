package com.formation.poo.exercicesPoo.employee;

public class Officier extends Operateur {


    public Officier() {
    }

    public Officier(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " Officier";
    }
}
