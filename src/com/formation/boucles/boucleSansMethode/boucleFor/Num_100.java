package com.formation.boucles.boucleSansMethode.boucleFor;

import java.util.Scanner;

public class Num_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero entre 1 jusqu'à 100: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num > 0 && num <= 100) {
            for (int i = 100; i >= num; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Veuillez de saisir un numero entre 1 et 100 ");
        }


    }
}
