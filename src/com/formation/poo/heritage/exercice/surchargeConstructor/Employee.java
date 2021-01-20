package com.formation.poo.heritage.exercice.surchargeConstructor;

public class Employee extends Personne {
    private double salaire;


    public Employee(String prenom, int age, double salaire) {
        super(prenom, age);
        this.salaire = salaire;

    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                " salaire: " + salaire +
                '}';
    }
}
