package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        List<Book> application = new ArrayList<>();
        application.add(BookManager.createBook("Da Vinci Code", "Dan Brown"));
        application.add(BookManager.createBook("Angels and demons", "Dan Brown"));
        application.add(BookManager.createBook("Lord of the rings", "J.R.R. Tolkien"));

    }
}
