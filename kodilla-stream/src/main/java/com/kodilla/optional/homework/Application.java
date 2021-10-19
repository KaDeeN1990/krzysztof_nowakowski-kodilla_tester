package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> pairs = new ArrayList<>();
        pairs.add(new Student("Kamil Kamiński", new Teacher("Agata Kulig")));
        pairs.add(new Student("Wojciech Wojtas", null));
        pairs.add(new Student("Karol Karolowski", new Teacher("Edyta Głowacz")));
        pairs.add(new Student("Adrian Szopa", null));

        for (Student s : pairs) {
            Optional<Teacher> teacher = Optional.ofNullable(s.getTeacher());
            String teacherName = teacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + s.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
