package com.formation.classEtObjets.passageCopieEtReference.passageCopie;

public class PassageParCopie {
    public static void main(String[] args) {
        int x = 10;
        impression(x);
        changerValeur(x);
        x = 15;
        impression(x);

    }

    public static void impression(int arg) {
        System.out.println("arg = " + arg);
    }

    public static void changerValeur(int i) {
        i = 200;
    }


}
