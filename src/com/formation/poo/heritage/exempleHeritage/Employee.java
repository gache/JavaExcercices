package com.formation.poo.heritage.exempleHeritage;

public class Employee extends Personne {
    private int idEmployee;
    private double salaire;
    public static int compteurId;

    public Employee(String prenom, double salaire) {
        super(prenom);
        this.salaire = salaire;
        compteurId++;
        this.idEmployee = compteurId;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "idEmployee=" + idEmployee +
                ", salaire=" + salaire +
                '}';
    }
}
