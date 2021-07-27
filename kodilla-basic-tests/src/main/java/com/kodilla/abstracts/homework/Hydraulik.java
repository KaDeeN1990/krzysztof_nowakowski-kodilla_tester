package com.kodilla.abstracts.homework;

public class Hydraulik extends Job{
    public Hydraulik() {
        super(3700, "wykonywanie prac wodno-kanalizacyjnych.", "Krzysztof");
    }
    @Override
    public void giveJob() {
        System.out.println("Zarobki Hydraulika to:");
    }
}
