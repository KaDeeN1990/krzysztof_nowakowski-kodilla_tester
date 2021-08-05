package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
            for (int i= 0; i < cars.length; i++)
                cars[i] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
            int drawnCar = random.nextInt(3);
            int a = random.nextInt(4);
            int b = random.nextInt(5);
            int c = random.nextInt(3);

            if (drawnCar == 0)
                return new Opel(a);
            else if (drawnCar == 1)
                return new Peugeot(b);
            else return new Seat(c);
    }
}
