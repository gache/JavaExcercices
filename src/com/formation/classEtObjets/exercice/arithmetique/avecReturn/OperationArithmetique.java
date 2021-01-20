package com.formation.classEtObjets.exercice.arithmetique.avecReturn;

import java.util.Scanner;

public class OperationArithmetique {
    int num1;
    int num2;
    int somme;
    int sustraction;
    int multiplication;
    int division;

    public void demandeInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Saisir un deuxième numero: ");
        num2 = Integer.parseInt(scanner.nextLine());
    }


    public int somme() {
        somme = num1 + num2;
        return somme;
    }

    public int sustraction() {
        sustraction = num1 - num2;
        return sustraction;
    }

    public int multiplication() {
        multiplication = num1 * num2;
        return multiplication;
    }

    public int division() {
        division = num1 / num2;
        return division;
    }

    public void voirResultat() {
        System.out.println("somme = " + somme);
        System.out.println("sustraction = " + sustraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
    }


}
