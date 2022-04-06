package com.libreria.demo.infrastructure.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Test")
public class Control {
    @GetMapping(value = "/hello")
    public ResponseEntity<String> execute() {
        return  ResponseEntity.status(HttpStatus.OK).body("hola clase");
    }

}
