package com.libreria.demo.Books.Book.Infrastructure.Adapters;

import com.libreria.demo.Books.Book.Domain.Book;
import com.libreria.demo.Books.Book.Domain.ports.BookRepository;
import com.libreria.demo.Books.author.Domain.Author;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class inMemoryUserRepository implements BookRepository {
    private List<Book> bdTemporal = new ArrayList<>();

    public void save(Book book) {
        bdTemporal.add(book);
    }


    public List<Book> list(String name) {
        List<Book> libros = new ArrayList<>();

        for (Book b: bdTemporal) {
           if(b.data().get("author").equals(name)){
               libros.add(b);
           }
        }
        return libros;
    }


    public Book details(String name) {
        return null;
    }


    public List<Book> all() {
        return bdTemporal;
    }
}
