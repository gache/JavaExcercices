package com.formation.conditions;

import java.util.Scanner;

public class NumMaximun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir trois numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max;

        if (num1 > num2 && num2 > num3) {
            max = num1;
            System.out.println("le maximum est = " + max);
        } else if (num1 > num3 && num3 > num2) {
            max = num1;
            System.out.println("le maximum est = " + max);
        } else if (num2 > num1 && num1 > num3) {
            max = num2;
            System.out.println("le maximum est = " + max);
        } else if (num2 > num3 && num3 > num1) {
            max = num2;
            System.out.println("le maximum est = " + max);
        } else if (num3 > num1 && num1 > num2) {
            max = num3;
            System.out.println("le maximum est = " + max);
        } else if (num3 > num2 && num2 > num1) {
            max = num3;
            System.out.println("le maximum est = " + max);
        }
    }

}

