package com.formation.variables;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le titre du livre");
        String titre = scanner.nextLine();

        System.out.println("Nom de l'auteur");
        String auteur = scanner.nextLine();

        System.out.println(titre + " a été écrit par " +auteur);


    }
}
