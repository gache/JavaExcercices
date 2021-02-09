package com.formation.Operateurs.ternaire;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(c + (c >= 0 ? " est positif" : " est negatif"));
        System.out.println(c + (c % 2 == 0 ? " est pair" : " est impair"));
        System.out.println(c + (c % 5 == 0 ? " est multiple de 5" : " n'est pas multiple de 5"));
        System.out.println(c + (c % 10 == 0 ? " est multiple de 10" : " n'est pas multiple de 10"));
        System.out.println(c + (c > 100 ? " est supérieur à 100" : " n'est pas supérieur à 100"));


    }
}
