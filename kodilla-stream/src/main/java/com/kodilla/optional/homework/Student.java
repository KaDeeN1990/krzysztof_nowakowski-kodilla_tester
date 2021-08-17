package com.kodilla.optional.homework;

import java.util.Objects;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, String Teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName2() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
