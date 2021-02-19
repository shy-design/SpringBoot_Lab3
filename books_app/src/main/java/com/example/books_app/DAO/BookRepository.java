package com.example.books_app.DAO;

import com.example.books_app.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book, Integer> {
}
