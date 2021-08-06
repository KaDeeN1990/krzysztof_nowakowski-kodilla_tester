package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    private int speed;

    public Peugeot(int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = speed + 15;

    }

    public void decreaseSpeed() {
        speed = speed - 10;

    }

    @Override
    public String toString() {
        return "Peugeot{" +
                "speed=" + speed +
                '}';
    }
}
