package com.formation.conditions;

import java.util.Scanner;

public class Caractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un Caractère: ");
        char caractere = scanner.next().charAt(0);

        if ((caractere >= 'a' && caractere <= 'z') || (caractere >= 'A' && caractere <= 'Z')) {
            System.out.println(caractere + " est une lettre.");
        } else if (caractere >= '0' && caractere <= '9') {
            System.out.println(caractere + " est un chiffre.");
        } else {
            System.out.println(caractere + " est un caractère spéciale.");
        }
    }
}
