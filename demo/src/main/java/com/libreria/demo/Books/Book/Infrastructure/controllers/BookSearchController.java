package com.libreria.demo.Books.Book.Infrastructure.controllers;

import com.libreria.demo.Books.Book.Application.search.BookSearchResponse;
import com.libreria.demo.Books.Book.Application.search.bookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/Book")
public class BookSearchController {

    @Autowired
    private bookSearch all;

    @GetMapping(value = "/all")
        public ResponseEntity<List<HashMap<String,Object>>> execute(){
        BookSearchResponse response = new BookSearchResponse(all.execute("hola"));
        return ResponseEntity.status(HttpStatus.OK).body(response.Response());
    }
}
