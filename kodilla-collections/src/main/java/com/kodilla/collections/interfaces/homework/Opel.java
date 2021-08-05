package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

        private int speed;

        public Opel(int speed){
            this.speed = speed;
        }

    public int getSpeed() {
        return speed + increaseSpeed()*3 - decreaseSpeed()*2;
    }

    public int increaseSpeed() {
        return  25;

    }

    public int decreaseSpeed() {
        return 30;

    }


}
