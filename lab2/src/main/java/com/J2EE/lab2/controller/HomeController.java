package com.J2EE.lab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Lab 02 - Book Management API";
    }

    @GetMapping("/info")
    public String info() {
        return "Available endpoints:\n" +
                "GET /books - Get all books\n" +
                "GET /books/{id} - Get book by ID\n" +
                "POST /books - Add new book\n" +
                "PUT /books/{id} - Update book\n" +
                "DELETE /books/{id} - Delete book";
    }
}
