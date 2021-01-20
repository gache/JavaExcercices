package com.formation.classEtObjets.motStatic;

public class MainPersonneMotStatic {
    public static void main(String[] args) {

        PersonneMotStatic p1 = new PersonneMotStatic("Juan");
        PersonneMotStatic p2 = new PersonneMotStatic("Maria");
        PersonneMotStatic p3 = new PersonneMotStatic("Hugo");
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("p3:" + p3);

        System.out.println("N° Personne = " + PersonneMotStatic.getCompteurPersonne());


    }
}
