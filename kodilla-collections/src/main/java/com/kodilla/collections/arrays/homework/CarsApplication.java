package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int drawnCar = random.nextInt(15) + 1;
        Car[] cars = new Car[drawnCar];
            for (int i= 0; i < cars.length; i++)
                cars[i] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
            int drawnCar = random.nextInt(3);
            int a = random.nextInt(165);
            int b = random.nextInt(170);
            int c = random.nextInt(150);

            if (drawnCar == 0)
                return new Opel(a);
            else if (drawnCar == 1)
                return new Peugeot(b);
            else return new Seat(c);
    }
}
