package com.formation.tableau.exercices;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature;

        do {
            System.out.println("Saisir la taille du tableau: ");
            temperature = Integer.parseInt(scanner.nextLine());
        } while (temperature <= 0);

        double[] tempertures = new double[temperature];

        for (int i = 0; i < tempertures.length; i++) {
            System.out.println("Saisir la temperature " + (i + 1));
            tempertures[i] = scanner.nextDouble();
        }

        for (double t : tempertures) {
            System.out.print("\t" + t);
        }


    }
}
