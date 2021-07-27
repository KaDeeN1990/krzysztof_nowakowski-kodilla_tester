package com.kodilla.abstracts.homework;

public class trapez extends Shape{
    public trapez() {
        super(8, 16);
    }
    @Override
    public void giveWzor() {
        System.out.println("wzor na trapez to 1/2 * a * h");
    }
}
