package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {

    private int speed;

    public Seat(int speed) {
        this.speed = speed;
    }


    public int getSpeed() {
        return speed + increaseSpeed()*3 - decreaseSpeed()*2;
    }

    public int increaseSpeed() {
        return 10;

    }

    public int decreaseSpeed() {
        return 20;

    }

    @Override
    public String toString() {
        return "Seat{" +
                "speed=" + speed +
                '}';
    }
}
