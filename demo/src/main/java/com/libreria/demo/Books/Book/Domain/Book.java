package com.libreria.demo.Books.Book.Domain;

import com.libreria.demo.Books.Book.Domain.ValueObjects.TitleBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.descriptionBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.priceBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.yearBook;
import com.libreria.demo.Books.author.Domain.Author;

import java.util.HashMap;

public class Book {
    private descriptionBook Description;
    private priceBook price;
    private TitleBook title;
    private yearBook year;
    private Author author;

    public Book(descriptionBook description, priceBook price, TitleBook title, yearBook year, Author author) {
        Description = description;
        this.price = price;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public HashMap<String,Object> data(){
      HashMap<String,Object> data = new HashMap<>(){{
          put("description",Description.value());
          put("price",price.value());
          put("title", title.value());
          put("year",year.value());
          put("author",author.toString());
        }
      };
      return data;
    }


}
