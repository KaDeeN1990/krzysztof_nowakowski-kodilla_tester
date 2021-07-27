package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;
    private String name;
    private int age;

    public Job(int salary, String responsibilities, String name, int age) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.name = name;
        this.age = age;
    }
    public int getSalary(){
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
    public String getName() { return name; }
    public int  getAge() {return age;}
}
