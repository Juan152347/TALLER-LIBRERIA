package com.libreria.demo.Books.Book.Infrastructure.controllers;


import com.libreria.demo.Books.Book.Application.create.BookCreate;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Book")
public class BookCreateController {
    @Autowired(required = false)
    private BookCreate creator;

    @PostMapping(value = "/create")
    public ResponseEntity execute(@RequestBody BookCreatorRequest request ){
        creator.execute(request.getDesciption(),Double.parseDouble(request.getPrice()),request.getTitle(),Integer.parseInt(request.getYear()),request.getName(),request.getLastname());
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

        static class BookCreatorRequest{
            private String desciption;
            private String price;
            private String title;
            private String year;
            private String name;
            private String lastname;

            public String getDesciption() {
                return desciption;
            }

            public void setDesciption(String desciption) {
                this.desciption = desciption;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLastname() {
                return lastname;
            }

            public void setLastname(String lastname) {
                this.lastname = lastname;
            }
        }

}
