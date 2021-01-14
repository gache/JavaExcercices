package com.formation.variables.convertionNum;

import java.util.Scanner;

public class ConvertionNum {
    public static void main(String[] args) {

        // Convertion de String a int
        int age = Integer.parseInt("20");
        System.out.println("age = " + age);

        // Convertion de String a double
        double valeurPi = Double.parseDouble("3.14");
        System.out.println("valeurPi = " + valeurPi);

        // Convertion de String a char
        char c = "hola".charAt(0);
        System.out.println("c = " + c);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir votre Age: ");
        int age2 = Integer.parseInt(scanner.nextLine());
        System.out.println("age2 = " + age2);

        System.out.println("Mettre un mot: ");
        char character = scanner.nextLine().charAt(0);
        System.out.println("character = " + character);

        // Convertion d'un type primitif a String
        String valeurText = String.valueOf(15); // avec un numero primitif
        System.out.println("valeurText = " + valeurText);

        String valeurPiText = String.valueOf(valeurPi); // avec une variable
        System.out.println("valeurPiText = " + valeurPiText);


    }
}
