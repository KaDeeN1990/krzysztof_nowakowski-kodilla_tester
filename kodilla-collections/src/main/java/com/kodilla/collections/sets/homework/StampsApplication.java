package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Battle", "25cm x 25cm", true));
        stamps.add(new Stamp("Love", "30cm x 30cm", false));
        stamps.add(new Stamp("Landscape", "20cm x 20cm", true));
        stamps.add(new Stamp("Love", "30cm x 30cm", false));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
