package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Seat seat = new Seat(90);
        doRace(seat);

        Peugeot peugeot = new Peugeot(75);
        doRace(peugeot);

        Opel opel = new Opel(110);
        doRace(opel);
    }
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Ostateczna prędkość samochodu to " + car.getSpeed());
    }
}
