package com.formation.boucles.boucleSansMethode.boucleFor;

import java.util.Scanner;

public class Chaine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une phrase: ");
        String phrase = scanner.nextLine();
        phrasePara(phrase);
    }

    public static void phrasePara(String phrase) {
        int str = phrase.length();

        for (int i = 0; i < str + 4; i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println("# " + phrase + " #");
        for (int i = 0; i < str + 4; i++) {
            System.out.print("#");
        }
    }


}
