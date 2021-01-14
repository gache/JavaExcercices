package com.formation.Operateurs.relationOuDegalite;

public class Relation {
    public static void main(String[] args) {

        int a = 3, b = 2;
        boolean c = (a > b); // Supérieur à
        System.out.println("c = " + c);

        int d = 3, e = 3;
        boolean f = (d >= e);  // Supérieur ou égal à
        System.out.println("f = " + f);


        int g = 8, h = 6;
        boolean i = (g < h); // Inférieur à
        System.out.println("i = " + i);


        int j = 9, k = 9;
        boolean l = (j <= k); //  Inférieur ou égal à
        System.out.println("j = " + l);


        if (a % 2 == 0){
            System.out.println("Le numero est pair");
        }else{
            System.out.println("Le numero est impaire");
        }
        if (b % 2 != 0){
            System.out.println("Le numero est impaire ");
        }else{
            System.out.println("Le numero est pair ");
        }


    }
}
