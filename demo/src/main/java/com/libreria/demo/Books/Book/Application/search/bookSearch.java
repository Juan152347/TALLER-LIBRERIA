package com.libreria.demo.Books.Book.Application.search;

import com.libreria.demo.Books.Book.Domain.ports.BookRepository;
import com.libreria.demo.Books.Book.Domain.Book;


import java.util.List;

public class bookSearch {
    BookRepository bookRepository;
    public List<Book> execute(String name){
        return bookRepository.all();
    }
}
