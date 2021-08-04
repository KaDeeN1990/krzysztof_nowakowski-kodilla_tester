package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

        private int speed;

        public Opel(int speed){
            this.speed = speed;
        }

    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed() {
        return speed + 25;

    }

    public int decreaseSpeed() {
        return speed - 30;

    }


}
