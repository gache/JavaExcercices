package com.formation.classEtObjets.exercice.arithmetique.sansReturn;

public class OperationArithmetique {
    int num1;
    int num2;
    int somme;
    int sustraction;
    int multiplication;
    int division;

    public OperationArithmetique(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void somme() {
        somme = num1 + num2;
    }

    // avec Argument
    public void sustraction(int numero1, int numero2) {
        sustraction = numero1 - numero2;
    }

    public void multiplication(int numero1, int numero2) {
        multiplication = numero1 * numero2;
    }

    public void division() {
        division = num1 / num2;
    }

    public void voirResultat() {
        System.out.println("somme = " + somme);
        System.out.println("sustraction = " + sustraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
    }

}
