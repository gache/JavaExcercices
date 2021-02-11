package com.formation.tableau.arrayliste;

import java.util.ArrayList;
import java.util.Iterator;

public class DeclarationArrayList {
    public static void main(String[] args) {

        ArrayList<String> prenom = new ArrayList<>();
        prenom.add("Juan");
        prenom.add("Pedro");
        prenom.add("Atia");
        prenom.add("Maria");

        System.out.println("Boucle for");
        for (int i = 0; i < prenom.size(); i++) {
            System.out.println("\t" + prenom.get(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("Boucle forEach");
        for (String s : prenom) {
            System.out.println("\t" + s);
        }
        System.out.println();
        System.out.println();
        System.out.println("Boucle avec Iterator");
        Iterator it = prenom.iterator();
        while (it.hasNext()) {
            System.out.println("\t" + it.next());
        }

    }
}
