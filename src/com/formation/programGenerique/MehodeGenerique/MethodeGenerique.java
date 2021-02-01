package com.formation.programGenerique.MehodeGenerique;

import com.formation.programGenerique.arrayliste.Employee;

public class MethodeGenerique {
    public static void main(String[] args) {

        String[] prenoms = {"Marie", "Jose", "Pepe", "Adeline", "Amelie"};
        String elements = MesMatrix.getElements(prenoms);
        System.out.println(elements);
        System.out.println(MesMatrix.getOrdre(prenoms));

//        Employee[] listEmployee = {new Employee("Juan", 35, 1900),
//                new Employee("Juan", 35, 1900),
//                new Employee("Juan", 35, 1900),
//                new Employee("Juan", 35, 1900),
//                new Employee("Juan", 35, 1900)};
//
//        String employees = MesMatrix.getElements(listEmployee);
//        System.out.println(employees);


    }
}
