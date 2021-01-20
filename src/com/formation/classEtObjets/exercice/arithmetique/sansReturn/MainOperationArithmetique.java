package com.formation.classEtObjets.exercice.arithmetique.sansReturn;

public class MainOperationArithmetique {
    public static void main(String[] args) {
        OperationArithmetique operationArithmetique = new OperationArithmetique(6, 3); // parametre au constructor
        operationArithmetique.somme();
        operationArithmetique.sustraction(15, 9); // arguemnt à la methode
        operationArithmetique.multiplication(9, 8);
        operationArithmetique.division();
        operationArithmetique.voirResultat();
    }

}
