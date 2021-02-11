package com.formation.tableau.exercices;

public class TableauChar {
    public static void main(String[] args) {
        char[] cadena = new char[8];
        System.out.println(cadena);
        System.out.println(cadena.length);
        cadena[0] ='m';
        cadena[1] ='n';
        System.out.println(cadena.length);
        System.out.println(cadena);
        System.out.println(cadena);
        System.out.println(".");

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        String s = new String(vocales);
        System.out.println(s.getClass());
        System.out.println(vocales);
        System.out.println(vocales.length);
    }
}
