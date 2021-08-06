package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {

    private int speed;

    public Seat(int speed) {
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = speed + 10;

    }

    public void decreaseSpeed() {
        speed = speed -20;

    }

    @Override
    public String toString() {
        return "Seat{" +
                "speed=" + speed +
                '}';
    }
}
