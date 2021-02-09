package com.formation.Operateurs.ternaire;

import java.util.Scanner;

public class NumPositifNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numéro: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(b + (b >= 0 ? " est positif" : " est negatif"));
    }
}
