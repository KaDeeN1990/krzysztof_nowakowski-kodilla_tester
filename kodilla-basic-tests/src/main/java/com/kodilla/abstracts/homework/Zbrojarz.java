package com.kodilla.abstracts.homework;

public class Zbrojarz extends Job{
    public Zbrojarz() {
        super (3300, "Zbrojenie fundamentów.", "Antek");
    }
    @Override
    public void giveJob() {
        System.out.println("Zarobki zbrojarza to:");
    }
}
