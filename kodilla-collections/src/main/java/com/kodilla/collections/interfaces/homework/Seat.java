package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {

    private int speed;

    public Seat(int speed) {
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed() {
        return speed + 10;

    }

    public int decreaseSpeed() {
        return speed - 20;

    }
}
