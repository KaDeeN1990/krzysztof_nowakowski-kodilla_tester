package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    private int speed;

    public Peugeot(int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return speed + increaseSpeed()*3 - decreaseSpeed()*2;
    }

    public int increaseSpeed() {
        return 15;

    }

    public int decreaseSpeed() {
        return 10;

    }
}
