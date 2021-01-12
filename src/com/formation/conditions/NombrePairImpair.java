package com.formation.conditions;

import java.util.Scanner;


public class NombrePairImpair {
    public static void main(String[] args) {
        // instatation de la class scanner
        Scanner scanner = new Scanner(System.in);

        // demande de saisir un numero et je le stock dans la variable numero
        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        // Evaluation des condition pour savoir si le numéro positif, negatif, pair, ou impair
        if( numero > 0 && numero % 2 == 0){
            System.out.println("Le numero: " + numero + " est positif est pair" );
        } else if(numero > 0 && numero % 2 != 0){
            System.out.println("Le numero: " + numero + " est positif est impair" );
        }
        else if(numero < 0 && numero % 2 == 0){
            System.out.println("Le numero: " + numero + " est negatif et pair");
        }
        else if(numero < 0 && numero % 2 != 0) {
            System.out.println("Le numero: " + numero + " est negatif et impair");
        }else{
            System.out.println("Le Numero est zéro ");
        }
    }
}
