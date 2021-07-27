package com.kodilla.abstracts.homework;

public class Person {

    static Job Hydraulik = new Hydraulik();
    static Job Zbrojarz = new Zbrojarz();
    static Job Murarz = new Murarz();

    public static void main(String[] args) {
        JobProcessor processor = new JobProcessor();
        processor.process(Hydraulik);
        JobProcessor process = new JobProcessor();
        process.process(Zbrojarz);
        JobProcessor processor1 = new JobProcessor();
        processor1.process(Murarz);

    }

}
