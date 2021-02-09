package com.formation.poo.exercicesPoo.employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Raphael");
        Cadre cadre = new Cadre("Marie");
        Operateur operateur = new Operateur("Juan");
        Officier officier = new Officier();
        officier.setPrenom("Lucie");
        Technicien technicien = new Technicien();
        technicien.setPrenom("Pierre");


        System.out.println(employee1.toString());
        System.out.println(cadre.toString());
        System.out.println(operateur.toString());
        System.out.println(officier.toString());
        System.out.println(technicien.toString());
    }
}
