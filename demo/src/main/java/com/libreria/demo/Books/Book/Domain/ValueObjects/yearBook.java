package com.libreria.demo.Books.Book.Domain.ValueObjects;

public class yearBook {
    private int value;

    public yearBook(int value) {
        validate(value);
        this.value = value;
    }
    public int value(){
        return value;
    }

    private void validate(int value){
         Validateyear(value);
    }
    private void Validateyear(int value){
        if(value<1000 || value>2022){
            throw new RuntimeException("ano Invalido");
        }
    }
}
