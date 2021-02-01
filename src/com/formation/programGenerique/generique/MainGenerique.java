package com.formation.programGenerique.generique;

public class MainGenerique {
    public static void main(String[] args) {

        Generique<String> generique = new Generique<>();
        generique.setPremier("Hola");
        System.out.println(generique.getPremier());

        Personne personne = new Personne("Juan");

        Generique<Personne> personneGenerique = new Generique<>();
        personneGenerique.setPremier(personne);
        System.out.println(personneGenerique.getPremier().toString());


    }
}


class  Personne {
    private String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "prenom: '" + prenom + '\'' +
                '}';
    }
}