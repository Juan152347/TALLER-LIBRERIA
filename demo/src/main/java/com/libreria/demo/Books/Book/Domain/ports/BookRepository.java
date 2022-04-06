package com.libreria.demo.Books.Book.Domain.ports;

import com.libreria.demo.Books.author.Domain.Author;
import com.libreria.demo.Books.Book.Domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookRepository {
    public void save(Book book);
    public List<Book> list(String name);
    public Book details(String name);
    public List<Book> all();
}
