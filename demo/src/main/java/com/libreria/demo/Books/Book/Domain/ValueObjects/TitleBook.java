package com.libreria.demo.Books.Book.Domain.ValueObjects;

public class TitleBook {
    private String value;

    public TitleBook(String value) {
        validate(value);
        this.value = value;
    }
    public String value(){
        return value;
    }

    private void validate(String value){
        lengthValue(value);
    }

    private void lengthValue(String value){
        if(value.length()<5 || value.length()>100){
            throw new RuntimeException("Longitud Invalida");
        }
    }
}
