package com.libreria.demo.Books.Book.Domain.ValueObjects;

public class descriptionBook {
    private String value;

    public descriptionBook(String value) {
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
        if(value.length()>200){
            throw new RuntimeException("Longitud Invalida");
        }
    }

}
