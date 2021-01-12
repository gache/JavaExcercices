package com.formation.conditions;

import java.util.Scanner;

public class NumDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 13 == 0) {
            System.out.println( num +" est divisible par 3 et 13");
        }else {
            System.out.println(num+" n'est pas divisible par 3 et 13");
        }
    }
}
