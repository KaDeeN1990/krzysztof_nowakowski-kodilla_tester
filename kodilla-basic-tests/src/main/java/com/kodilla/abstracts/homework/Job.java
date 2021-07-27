package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;
    private String name;

    public Job(int salary, String responsibilities, String name) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
    public String getName() { return name; }
    public abstract void giveJob();
}
