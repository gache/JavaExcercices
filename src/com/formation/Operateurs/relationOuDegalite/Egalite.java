package com.formation.Operateurs.relationOuDegalite;

public class Egalite {
    public static void main(String[] args) {
        // Pour faire la comparaison avec type primitif  on utilise  == et !=

        // Egal à " == "
        int a = 3, b = 2;
        boolean c = (a == b);
        System.out.println("c = " + c); // c'est false car deux variable ne sont pas égal

        int d = 3, e = 3;
        boolean f = (d == e);
        System.out.println("f = " + f);  // c'est true car deux variable sont  égal

        // Différent de " !=  "

        int g = 3, h = 3;
        boolean i = (g != h);
        System.out.println("i = " + i); //  c'est false car deux variable ne sont pas different


        int j = 3, k = 9;
        boolean l = (j != k);
        System.out.println("j = " + l); //  c'est true car deux variable sont different


        // Pour faire la comparaison avec String on utilise la methode equals()
        String s = "hello", S = "hello";
        boolean resultat = s.equals(S);
        System.out.println("resultat = " + resultat);

        String t = "hello", T = "Salut";
        boolean resultat2 = t.equals(T);
        System.out.println("resultat = " + resultat2);

    }
}
