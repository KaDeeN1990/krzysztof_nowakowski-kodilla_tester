package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        List<BookManager> application = new ArrayList<>();
        application.add(BookManager.createBook("Da Vinci code", "Dan Brown"));
        application.add(BookManager.createBook("Angels and Demons", "Dan Brown"));
        application.add(BookManager.createBook("Lord of the Rings", "J.R.R. Tolkien"));
    }
}
