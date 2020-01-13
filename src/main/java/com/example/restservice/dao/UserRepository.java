package com.example.restservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}