package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Seat;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("---------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Speed: " + car.getSpeed());

    }
    private static String getCarName(Car car){
        if (car instanceof Seat)
            return "Seat";
        else if (car instanceof Peugeot)
            return "Peugeot";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown model.";
    }
}
