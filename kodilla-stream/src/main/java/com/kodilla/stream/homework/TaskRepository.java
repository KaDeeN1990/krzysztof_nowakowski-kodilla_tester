package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTask(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Work", LocalDate.of(2021, 8, 1), LocalDate.of(2021, 11, 1)));
        tasks.add(new Task("Homework", LocalDate.of(2021, 9, 23), LocalDate.of(2022,3,1)));
        tasks.add(new Task("First Module", LocalDate.of(2021, 7, 17), LocalDate.of(2021, 7, 25)));
        tasks.add(new Task("Second Module", LocalDate.of(2021, 7, 26), LocalDate.of(2021, 8, 2)));
        return tasks;
    }
}
