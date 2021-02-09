package com.formation.variables.convertionNum;

import java.util.Scanner;

public class ExerciceMagLivre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom du livre: ");
        String nom = scanner.nextLine();

        System.out.println("Id du livre: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Prix du livre: ");
        double prix = Double.parseDouble(scanner.nextLine());

        System.out.println("Symbole de la monnais: ");
        char symbole = scanner.nextLine().charAt(0);

        System.out.println("Envoi du Livre: ");
        boolean envoieGratuit = scanner.nextBoolean();

        System.out.println(nom + "#" + id);
        System.out.println("Precio = " +  prix +symbole );
        System.out.println("envioGratuito = " + envoieGratuit);


    }
}
