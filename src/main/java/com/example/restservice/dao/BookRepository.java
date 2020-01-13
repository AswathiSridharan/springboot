package com.example.restservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restservice.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
