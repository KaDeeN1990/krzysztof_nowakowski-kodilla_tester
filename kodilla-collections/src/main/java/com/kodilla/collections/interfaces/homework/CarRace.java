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
        System.out.println(car.getSpeed());
    }
}
