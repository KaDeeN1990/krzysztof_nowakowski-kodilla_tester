package com.kodilla.inheritance.homework;

public class WindowsProgram {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1992);
        operatingSystem.turnOff();
        operatingSystem.turnOn();
        System.out.println(operatingSystem.getYear());


        Windows windows = new Windows(1992);
        windows.closeProgram();
        windows.openProgram();
        windows.turnOn();

}}
