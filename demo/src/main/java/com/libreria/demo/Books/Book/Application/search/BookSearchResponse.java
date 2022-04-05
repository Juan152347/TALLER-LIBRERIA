package com.libreria.demo.Books.Book.Application.search;

import com.libreria.demo.Books.Book.Domain.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BookSearchResponse {
    List<Book> books;

    public BookSearchResponse(List<Book> books) {
        this.books = books;
    }

    public List<HashMap<String,Object>> Response(){
        List<HashMap<String,Object>> response = books.stream().map(book -> book.data()).collect(Collectors.toList());
        return response;
    }
}
