package com.kodilla.abstracts.homework;

public class Murarz extends Job{
    public Murarz() {
        super (3500, "murowanie ścian.", "Wiesiek", 58);
    }
    @Override
    public void giveJob() {
        System.out.println("Zarobki murarza to:");
    }
}
