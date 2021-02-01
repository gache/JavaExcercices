package com.formation.programGenerique.arrayliste;

public class Employee {
    private String prenom;
    private int age;
    private double salaire;


    public Employee(String prenom, int age, double salaire) {
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }


    public String voirResultat() {
        return "Le employée s'appelle " + prenom + " age: " + age + " ans " + "a un salaire de: " + salaire;
    }


}
