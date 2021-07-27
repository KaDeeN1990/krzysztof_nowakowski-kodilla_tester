package com.kodilla.abstracts.homework;

public class JobProcessor {
    public void process(Job job) {
        System.out.println("Pracownik ma na imię " + job.getName() + " ma " + job.getAge() + " lat, zarabia " + job.getSalary() + " a jego obowiązki to " + job.getResponsibilities());
    }
}
