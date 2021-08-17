package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> pairs = new ArrayList<>();
        pairs.add(new Student("Kamil Kamiński", "Agata Kulig"));
        pairs.add(new Student("Wojciech Wojtas", null));
        pairs.add(new Student("Karol Karolowski", "Edyta Głowacz"));
        pairs.add(new Student("Adrian Szopa", null));

        Optional<List<Student>> optionalStudent = Optional.ofNullable(pairs);

        optionalStudent.ifPresent(u -> System.out.println(pairs));
    }
}
