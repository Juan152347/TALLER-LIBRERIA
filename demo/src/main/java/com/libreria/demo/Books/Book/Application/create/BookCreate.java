package com.libreria.demo.Books.Book.Application.create;

import com.libreria.demo.Books.Book.Domain.ValueObjects.TitleBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.descriptionBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.priceBook;
import com.libreria.demo.Books.Book.Domain.ValueObjects.yearBook;
import com.libreria.demo.Books.Book.Domain.ports.BookRepository;
import com.libreria.demo.Books.Book.Domain.Book;
import com.libreria.demo.Books.author.Domain.Author;


public class BookCreate {
    private BookRepository bookrepository;

    public BookCreate(BookRepository bookrepository) {
        this.bookrepository = bookrepository;
    }

    public void execute(String description, double price, String title, int year, String name, String lastname){
        descriptionBook Description = new descriptionBook(description);
        priceBook Price = new priceBook(price);
        TitleBook Title = new TitleBook(title);
        yearBook Year = new yearBook(year);
        Author author = new Author(name,lastname);

        Book book = new Book(Description,Price,Title,Year,author);
        bookrepository.save(book);
    }
}
