package com.formation.classEtObjets.encapsulation.encaPrivate;


public class EncapsulationPrivate {
    public static void main(String[] args) {
        PersonnePrivate personne = new PersonnePrivate();
        personne.setPrenom("Maria");
        personne.setNom("Trujillo");
        personne.setEffacer(true);
        System.out.println(personne);

        PersonnePrivate personnePrivate2 = new PersonnePrivate("Juan", "Gomez", false);
        System.out.println(personnePrivate2);
        personnePrivate2.setPrenom("Ines");
        personnePrivate2.setNom("Caballero");
        personne.setEffacer(true);
        System.out.println(personnePrivate2);

    }
}


