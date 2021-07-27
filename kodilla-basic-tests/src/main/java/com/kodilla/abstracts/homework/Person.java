package com.kodilla.abstracts.homework;

public class Person {
    public String firstname;
    public int age;
    public String job;

    public Person(String firstname, int age, String job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }
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
