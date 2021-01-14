package com.formation.conditions;

import java.util.Scanner;

public class Qualitication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int note = Integer.parseInt(scanner.nextLine());

        if (note >= 0 && note < 6) {
            System.out.println("F");
        } else if (note >= 6 && note < 7) {
            System.out.println("D");
        } else if (note >= 7 && note < 8) {
            System.out.println("C");
        } else if (note >= 8 && note < 9) {
            System.out.println("B");
        } else if (note >= 9 && note <= 10) {
            System.out.println("A");
        } else {
            System.out.println("Valor desconocido");
        }
    }

}
