package com.formation.classEtObjets.passageCopieEtReference.passageReference;

public class PersonnePasReference {

    String prenom;

    public void changerPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    public String avoirPrenom() {
        return this.prenom;
    }
}
