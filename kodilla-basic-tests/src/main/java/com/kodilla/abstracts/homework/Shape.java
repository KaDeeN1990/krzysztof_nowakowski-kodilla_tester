package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int polePowierzchni;
    private int obwod;

    public Shape(int polePowierzchni, int obwod) {
        this.polePowierzchni = polePowierzchni;
        this.obwod = obwod;
    }
    public int getPolePowierzchni() {
        return polePowierzchni;
    }
    public int getObwod() {
        return obwod;
    }
    public abstract void giveWzor();

}
