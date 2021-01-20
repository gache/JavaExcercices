package com.formation.classEtObjets.motThis;

public class MotThis {
    public static void main(String[] args) {
        Personne personne = new Personne("Juan");

    }
}

class Personne {
    String prenom;

    public Personne(String prenom) {
        this.prenom = prenom; // this pointe sur un objet de type personne
        Impression impression = new Impression();
        impression.impression(this); // this contien un refrence à l'objet personne
    }


}

class Impression {
    public void impression(Personne personne) {
        System.out.println("Impression de l'argument: " + personne); // valeur de l'objet personne
        System.out.println("Impression de l'objet actuelle (this) " + this); // this pointe sur l'objet impression.
    }
}
