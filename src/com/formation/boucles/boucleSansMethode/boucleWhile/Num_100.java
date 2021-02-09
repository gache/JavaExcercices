package com.formation.boucles.boucleSansMethode.boucleWhile;

import java.util.Scanner;

public class Num_100 {
    public static void main(String[] args) {
        /*  Boucle sans demander le numero à saisir à l'utilisateur
         */
//        System.out.println("Numeros del 100 al 1: ");
//        int i = 100;
//        while (i >= 1) {
//            System.out.println(i);
//            i--;
//        }
        /*  Boucle en demandantr le numero à saisir à l'utilisateur
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero entre 1 jusqu'à 100: ");
        int num = Integer.parseInt(scanner.nextLine());

        int i = 100;
        if (num > 0 && num <= 100) {
            while (i >= num) {
                System.out.println(i);
                i--;
            }
        } else {
            System.out.println("Veuillez de saisir un numero entre 1 et 100 ");
        }
    }
}
