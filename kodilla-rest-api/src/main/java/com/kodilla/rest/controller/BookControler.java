package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {  // [2]
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public void deleteBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
}