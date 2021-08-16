package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.contains(book))
            return book;
        else {
            books.add(book);
            return book;
        }
    }
}
