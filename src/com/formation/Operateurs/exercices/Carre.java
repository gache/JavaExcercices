package com.formation.Operateurs.exercices;

import java.util.Scanner;

public class Carre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alto = Integer.parseInt(scanner.nextLine());
        int ancho = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) / 2;

        System.out.println("Area = " + area);
        System.out.println("Perimetro: " +  perimetro);




    }
}
