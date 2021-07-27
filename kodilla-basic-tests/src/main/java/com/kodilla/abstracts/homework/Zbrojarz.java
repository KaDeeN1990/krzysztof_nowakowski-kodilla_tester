package com.kodilla.abstracts.homework;

public class Zbrojarz extends Job{
    public Zbrojarz() {
        super (3300, "Zbrojenie fundamentów.", "Antek", 47);
    }
    @Override
    public void giveJob() {
        System.out.println("Zarobki zbrojarza to:");
    }
}
