package com.formation.classEtObjets.passageCopieEtReference.passageReference;

public class MainPersonnePasReference {
    public static void main(String[] args) {
        PersonnePasReference personne = new PersonnePasReference();
        personne.changerPrenom("Juan");
        imprimerPrenom(personne);
        modifierPersonne(personne);
        imprimerPrenom(personne);


    }

    public static void imprimerPrenom(PersonnePasReference p1) {
        System.out.println("Le valeur reçu est: " + p1.avoirPrenom());
    }

    public static void modifierPersonne(PersonnePasReference arg) {
        arg.changerPrenom("Erick");
    }



}
