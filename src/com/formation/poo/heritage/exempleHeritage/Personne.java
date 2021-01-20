package com.formation.poo.heritage.exempleHeritage;

public class Personne {

    private String prenom;
    private char sexe;
    private int age;
    private String direction;

    public Personne() {
    }

    public String getPrenom() {
        return prenom;
    }

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public Personne(String prenom, char sexe, int age, String direction) {
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.direction = direction;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "prenom='" + prenom + '\'' +
                ", sexe=" + sexe +
                ", age=" + age +
                ", direction='" + direction + '\'' +
                '}';
    }
}
