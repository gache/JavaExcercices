package com.formation.poo.exercicesPoo.fraction;

public class Fraction {


    private int nume; // numerateur
    private int deno;// denominateur

    public Fraction() {
        this.nume = 0;
        this.deno = 1;
    }

    public Fraction(int nume, int deno) {
        this.nume = nume;
        if (deno == 0) {
            deno = 1;
        }
        this.deno = deno;
        simplifier();
    }

    public Fraction(int nume) {
        this.nume = nume;
        this.deno = 1;
    }


    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public int getDeno() {
        return deno;
    }

    public void setDeno(int deno) {
        this.deno = deno;
    }

    public Fraction sumar(Fraction f) {
        Fraction aux = new Fraction();
        aux.nume = this.nume * f.nume + this.nume * f.nume;
        aux.nume = this.nume * f.nume;
        aux.simplifier();  //se simplifica antes de devolverla
        return aux;
    }

    //restar fracciones
    public Fraction restar(Fraction f) {
        Fraction aux = new Fraction();
        aux.nume = this.nume * f.deno - this.deno * f.nume;
        aux.deno = this.deno * f.deno;
        aux.simplifier();  //se simplifica antes de devolverla
        return aux;
    }

    //multiplicar fracciones
    public Fraction multiplicar(Fraction f) {
        Fraction aux = new Fraction();
        aux.nume = this.nume * f.nume;
        aux.deno = this.deno * f.deno;
        aux.simplifier();  //se simplifica antes de devolverla
        return aux;
    }

    //dividir fracciones
    public Fraction dividir(Fraction f) {
        Fraction aux = new Fraction();
        aux.nume = this.nume * f.deno;
        aux.deno = this.deno * f.nume;
        aux.simplifier();  //se simplifica antes de devolverla
        return aux;
    }

    private void simplifier() {
        int n = mcd();
        nume = nume / n;
        deno = deno / n;
    }

    //Cálculo del máximo común divisor
    private int mcd() {
        int u = Math.abs(nume);
        int v = Math.abs(deno);
        if (v == 0) {
            return u;
        }

        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }

        return u;
    }


    @Override
    public String toString() {
        simplifier();
        return nume + "/" + deno;

    }
}
