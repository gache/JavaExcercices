package com.formation.programGenerique.MehodeGenerique;

public class MesMatrix {


    public static <T> String getElements(T[] a) {
        return "Le tableau a " + a.length + " elements";
    }

    public static <T extends Comparable> T getOrdre(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T elementMenor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (elementMenor.compareTo(a[i]) > 0) {
                elementMenor = a[i];
            }
        }

        return elementMenor;

    }
}

