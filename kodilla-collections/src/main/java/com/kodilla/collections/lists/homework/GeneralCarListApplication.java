package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.LinkedList;
import java.util.List;

public class GeneralCarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Seat seat = new Seat(80);
        cars.add(seat);
        cars.add(new Peugeot(60));
        cars.add(new Opel(100));

        cars.remove(2);
        cars.remove(seat);

        System.out.println(cars.size());
        for (Car car : cars){
            System.out.println(car.getSpeed());
        }
    }
}
