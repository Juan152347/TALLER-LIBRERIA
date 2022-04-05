package com.libreria.demo.Books.author.Domain;

public class Author {
    private String name;
    private String lastname;

    public Author(String nombre, String apellido) {
        this.name = nombre;
        this.lastname = apellido;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String toString() {
        return this.name + " " + this.lastname;
    }
}
