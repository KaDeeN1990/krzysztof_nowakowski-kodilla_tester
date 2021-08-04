package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    private int speed;

    public Peugeot(int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return increaseSpeed() + decreaseSpeed();
    }

    public int increaseSpeed() {
        return speed + 15;

    }

    public int decreaseSpeed() {
        return speed - 10;

    }
}
