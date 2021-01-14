package com.formation.boucles.boucleSansMethode.BoucleFor;

public class ContinueBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue; // va à la suivante itération du cicle
            }
            System.out.println("i = " + i);
            // break; // coupe l'execution complement du cicle
        }
    }
}
