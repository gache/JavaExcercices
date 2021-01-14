package com.formation.boucles.boucleSansMethode.BoucleFor;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("********* Descendent ********");

        for (int j = num; j > 0; j--){
            System.out.println("j = " + j);
        }


    }
}
