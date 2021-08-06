package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Battle", "25mm x 25mm", true));
        stamps.add(new Stamp("Love", "30mm x 30mm", false));
        stamps.add(new Stamp("Landscape", "20mm x 20mm", true));
        stamps.add(new Stamp("Love", "30mm x 30mm", false));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
