package com.formation.classEtObjets.motNull;

public class MotNull {
    public static void main(String[] args) {

        Personne p1 = new Personne("Maria");
        System.out.println("Prenom p1 = " + p1.avoirPrenom());

        Personne p2 = p1;
        System.out.println("Prenom p2 = " + p2.avoirPrenom());

        p1 = null;
        System.out.println("Prenom p1 = " + p1);

    }
}


class Personne {
    String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public String avoirPrenom() {
        return this.prenom;
    }
}
