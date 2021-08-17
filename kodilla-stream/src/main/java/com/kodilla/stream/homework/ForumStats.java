package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg39 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg39);

        double avg40minus = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg40minus);
    }
}
