package com.formation.programGenerique.arrayliste;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEmployee {
    public static void main(String[] args) {

//        Employee[] listEmployee = new Employee[3];
//        listEmployee[0] = new Employee("Maria", 45, 2500);
//        listEmployee[1] = new Employee("Antoine", 49, 3500);
//        listEmployee[2] = new Employee("Juan", 35, 4500);

        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        // listEmployee.ensureCapacity(11); // Cette methode ensureCapacity permet de donner une taille ou limiter le nimbre d'élement de l'ArrayList
        listEmployee.add(new Employee("Maria", 45, 2500));
        listEmployee.add(new Employee("Antoine", 49, 3500));
        listEmployee.add(new Employee("Pedro", 35, 4500));
        listEmployee.add(new Employee("Juan", 35, 4500));
        listEmployee.add(new Employee("Maria", 45, 2500));
        listEmployee.add(new Employee("Antoine", 49, 3500));
        listEmployee.add(new Employee("Juan", 35, 4500));
        listEmployee.add(new Employee("Juan borrar", 35, 4500));
        //listEmployee.set(0,new Employee("Juan Nouevo ", 35, 4500)); // la methode set me permet d'ajouter un element à la liste dans la position que je veux
        //System.out.println(listEmployee.get(0).voirResultat()); // la methode get me permet de voir un element de la liste dans sa position
        //listEmployee.trimToSize(); // la methode trimToSize faire reduire l'espace de mémoire qu'on utilise pas
        //listEmployee.remove(11); // la methode remove elimine un element de la liste il faut indiquer l'index a effacer

        System.out.println("-------");
        System.out.println("********* La longueur de la liste *********");
        System.out.println(listEmployee.size()); // Cette methode size permet voir la taille ou la longueur de l'Array
        System.out.println();



        System.out.println("********* Une boucle avec l'Iterateur de la class ArrayList *********" );
        System.out.println();

        Iterator<Employee> iterator = listEmployee.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().voirResultat());
        }

        System.out.println("-------");


        System.out.println("********* Une boucle avec un forEach normal *********");
        System.out.println();
        for (Employee e : listEmployee) {
            System.out.println(e.voirResultat());
        }

        System.out.println("-------");

        System.out.println("********* Boucle for avec les methode la classe ArrayList *********");
        System.out.println();
        for (int i = 0; i < listEmployee.size(); i++) {
            Employee e = listEmployee.get(i);
            System.out.println(e.voirResultat());
        }

    }
}
