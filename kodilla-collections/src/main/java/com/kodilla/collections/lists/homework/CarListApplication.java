package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Opel> car = new ArrayList<>();
        car.add(new Opel(60));
        car.add(new Opel(90));
        car.add(new Opel(140));

        for (int i=0; i < car.size(); i++) {
            Opel opel = car.get(i);
            if (opel.getSpeed() > 90);
            System.out.println(opel + " speed " + opel.getSpeed());
        }
    }
}
