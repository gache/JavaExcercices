package com.formation.classEtObjets.methode;

import java.util.Scanner;

public class Arithmetique {
    Scanner scanner = new Scanner(System.in);

    int num1;
    int num2;
    int sustraction;
    int div;

    public void messageConsole() {
        System.out.println("Saisir un numero 1:");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Saisir un numero 2:");
        num2 = Integer.parseInt(scanner.nextLine());

    }

    // Avec return
    public int somme(int a, int b) {
        return a + b;
    }

    // Sans return
    public void reste() {
        sustraction = num1 - num2;

    }

    public int multi(int a, int b) {
        return a * b;
    }

    public void divisition() {
        div = num1 / num2;
    }

    public void resultat(){
        System.out.println("sustraction = " + sustraction);
        System.out.println("div = " + div);
    }


}
