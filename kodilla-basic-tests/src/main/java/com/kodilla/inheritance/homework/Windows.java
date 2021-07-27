package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year){
        super(year);
        System.out.println("OperatingSystem");
    }
    public void openProgram() {
        System.out.println("Opening program ...");
    }
    public void closeProgram() {
        System.out.println("Closing program...");
    }
    }
