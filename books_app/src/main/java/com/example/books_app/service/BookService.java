package com.example.books_app.service;

import com.example.books_app.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.books_app.entity.Book;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){

        return bookDAO.getBooks();
    }

    public Book createBook(Book book) {
        return bookDAO.createBook(book); }
}
