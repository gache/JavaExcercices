package com.formation.Operateurs.ternaire;

import java.util.Scanner;

public class PairImpaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un numéro: ");
        int A = Integer.parseInt(scanner.nextLine());
        System.out.println(A + (A % 2 == 0 ? " est pair" : " est impaire"));

    }
}
