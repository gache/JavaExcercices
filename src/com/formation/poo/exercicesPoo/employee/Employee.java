package com.formation.poo.exercicesPoo.employee;

public class Employee {

    private String prenom;


    public Employee() {
    }

    public Employee(String prenom) {
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
        return "Employee: " + prenom;
    }
}
