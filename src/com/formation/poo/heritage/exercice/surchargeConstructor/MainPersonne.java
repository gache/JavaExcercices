package com.formation.poo.heritage.exercice.surchargeConstructor;

public class MainPersonne {
    public static void main(String[] args) {

        Personne personne = new Personne("Lilia", 22);
        System.out.println("personne = " + personne);


        Employee employee1 = new Employee("Pedro", 25, 2500);
        Employee employee2 = new Employee("Maria", 20, 3500);
        System.out.println("employee1: " + employee1);
        System.out.println("employee2: " + employee2);
        System.out.println(Personne.getCompteurPersonne());

    }
}
