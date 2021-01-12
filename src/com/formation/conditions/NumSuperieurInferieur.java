package com.formation.conditions;

import java.util.Scanner;

public class NumSuperieurInferieur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux numéros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("Les deux numeros sont égal");
        }else if (num1 > num2){
            System.out.println("Le numero: " + num1 + " est superieur au numero: " + num2);
        }else {
            System.out.println("Le numero: " + num1 + " est inferieur au numero: " + num2);
        }

    }
}
