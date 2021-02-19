package com.example.books_app.controller;

import com.example.books_app.entity.Book;
import com.example.books_app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {
    //@RequestMapping("/books")
    //@GetMapping

    @Autowired
    private BookService bookService;
/*public String getBooks (){
    return "Hello world!!! My name is Kateryna";
    }*/

    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
