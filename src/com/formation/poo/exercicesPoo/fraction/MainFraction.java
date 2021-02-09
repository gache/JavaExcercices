package com.formation.poo.exercicesPoo.fraction;

public class MainFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction();
        Fraction f4 = new Fraction(4);

        Fraction suma = f1.sumar(f2);
        Fraction resta = f1.restar(f3);
        Fraction multi = f1.multiplicar(f4);
        Fraction divi = f1.dividir(f2);

        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + multi);
        System.out.println(f1 + " / " + f2 + " = " + divi);


    }
}
