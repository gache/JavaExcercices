package com.formation.poo.heritage.exempleHeritage;

import java.util.Date;

public class Client extends Personne {

    private int idClient;
    private Date dateRegistrer;
    private boolean vip;
    public static int compteurId;

    public Client( Date dateRegistrer, boolean vip) {
        this.dateRegistrer = dateRegistrer;
        compteurId++;
        idClient = compteurId;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getDateRegistrer() {
        return dateRegistrer;
    }

    public void setDateRegistrer(Date dateRegistrer) {
        this.dateRegistrer = dateRegistrer;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + "Client{" +
                "idClient=" + idClient +
                ", dateRegistrer=" + dateRegistrer +
                ", vip=" + vip +
                '}';
    }
}
