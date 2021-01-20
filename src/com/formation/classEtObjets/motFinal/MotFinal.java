package com.formation.classEtObjets.motFinal;

// avec le mot final cette class ne peut pas avoir de class fille ou faire l'heritage
public final class MotFinal {

    public static final int varPrimitif = 10;  // c'est une constante

    // final dans une methode
    // On n'est pas modifier cette methode depuis d'autre class fille; on ne peut pas faire la surécriture
    public  final  void methodoFinal(){

    }

}
