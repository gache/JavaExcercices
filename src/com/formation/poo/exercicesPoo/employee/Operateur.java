package com.formation.poo.exercicesPoo.employee;

public class Operateur extends Employee {


    public Operateur() {
    }

    public Operateur(String prenom) {
        super(prenom);
    }

    @Override
    public String toString() {
        return super.toString() + " Operateur";
    }
}
