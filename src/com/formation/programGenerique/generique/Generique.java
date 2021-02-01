package com.formation.programGenerique.generique;

public class Generique<T> {
    private T premier;

    public Generique() {
        this.premier = null;
    }

    public T getPremier() {
        return premier;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }
}
