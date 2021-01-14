package com.formation.conditions;

import java.util.Scanner;

public class NumeroMajorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = Integer.parseInt(scanner.nextLine());
        int numero2 = Integer.parseInt(scanner.nextLine());

        if (numero1 > numero2)
            System.out.println(numero1);
        else
            System.out.println(numero2);

        int resultat = numero1 > numero2 ? numero1 : numero2;
        System.out.println("resultat = " + resultat);


    }
}
