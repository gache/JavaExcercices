package com.formation.poo.heritage.exercice.surchargeConstructor;

public class Personne {
    private int idPersonne;
    private String prenom;
    private int age;
    private static int compteurPersonne;


    private Personne() {
        compteurPersonne++;
        this.idPersonne = compteurPersonne;
    }

    public Personne(String prenom, int age) {
        this();
        this.prenom = prenom;
        this.age = age;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                " idPersonne: " + idPersonne +
                ", prenom: " + prenom + '\'' +
                ", age: " + age +
                '}';
    }
}
