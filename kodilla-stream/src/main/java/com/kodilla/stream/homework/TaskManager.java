package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTask()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(uo->uo.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
    public static String getName(Task task){
        return task.getName();
    }
}
