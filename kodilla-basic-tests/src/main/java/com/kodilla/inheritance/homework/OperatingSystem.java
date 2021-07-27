package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    public OperatingSystem(int year){
        this.year = year;
    }
    public void turnOn(){
        System.out.println("Komputer jest włączony");
    }
    public void turnOff() {
        System.out.println("Komputer jest wyłączony");
    }
    public int getYear() {
        return year;
    }
}
