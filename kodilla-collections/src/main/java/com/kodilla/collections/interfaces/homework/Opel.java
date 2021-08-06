package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

        private int speed;

        public Opel(int speed){
            this.speed = speed;
        }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = speed + 25;

    }

    public void decreaseSpeed() {
        speed = speed - 30;

    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }
}
