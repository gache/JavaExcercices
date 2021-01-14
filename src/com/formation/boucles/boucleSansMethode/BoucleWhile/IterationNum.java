package com.formation.boucles.boucleSansMethode.BoucleWhile;

import java.util.Scanner;

public class IterationNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int num = Integer.parseInt(scanner.nextLine());

        while (num < 10) {
            System.out.println("num = " + num);
            num++;
        }

    }
}
