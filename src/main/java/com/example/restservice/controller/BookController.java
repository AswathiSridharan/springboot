package com.example.restservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.dao.BookRepository;
import com.example.restservice.model.Book;

@RestController
public class BookController {
	@Autowired
	BookRepository repo;
	
	// Get All Notes
    @GetMapping("/books")
    public List<Book> getAllNotes() {
    	System.out.println("Inside get");
        return repo.findAll();
    }

// Create a new Note
    @PostMapping("/books")
    public Book createNote(@Valid @RequestBody Book book) {
        return repo.save(book);
    }

}
