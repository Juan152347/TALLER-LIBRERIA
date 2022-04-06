package com.libreria.demo.Books.Book.Application.search;

import com.libreria.demo.Books.Book.Domain.ports.BookRepository;
import com.libreria.demo.Books.Book.Domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;


public class bookSearch {
    BookRepository bookRepository;

    public bookSearch(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> execute(String name){
        return bookRepository.all();
    }
}
