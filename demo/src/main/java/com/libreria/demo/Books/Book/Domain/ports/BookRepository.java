package com.libreria.demo.Books.Book.Domain.ports;

import com.libreria.demo.Books.author.Domain.Author;
import com.libreria.demo.Books.Book.Domain.Book;

import java.util.List;


public interface BookRepository {
    public void save(Book book);
    public List<Book> list(Author author);
    public Book details(String name);
}
