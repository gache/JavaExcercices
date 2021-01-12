package com.formation.conditions;

import java.util.Scanner;

public class VoyalleConsonne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un caractère: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " est une voyelle.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " est une consonnes.");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " est un numéro.");
        } else {
            System.out.println(ch + " autres.");
        }

    }
}
