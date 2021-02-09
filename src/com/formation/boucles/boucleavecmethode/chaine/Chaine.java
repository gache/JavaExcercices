package com.formation.boucles.boucleavecmethode.chaine;

import java.util.Scanner;

public class Chaine {

    String chaine;

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public void demandeInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une chaine de caractère: ");
        chaine = scanner.nextLine();
    }


    public static void chainePara(String chainePara) {
        int n = chainePara.length();

        for (int i = 0; i < n + 4; i++) {
            System.out.print("#");
        }

        System.out.println();
        System.out.println("# " + chainePara + " #");
        for (int i = 0; i < n + 4; i++) {
            System.out.print("#");
        }
    }


}
