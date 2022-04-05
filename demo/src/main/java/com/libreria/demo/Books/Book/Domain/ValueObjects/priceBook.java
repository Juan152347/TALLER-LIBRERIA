package com.libreria.demo.Books.Book.Domain.ValueObjects;

public class priceBook {
    private double value;

    public priceBook(double value) {
        validate(value);
        this.value = value;
    }
    public double value(){
        return value;
    }

    private void validate(double value){
        ValidatePrice(value);
    }
    private void ValidatePrice(double value){
        if(value<0 || value<10000){
            throw new RuntimeException("Precio Invalido");
        }
    }
}
