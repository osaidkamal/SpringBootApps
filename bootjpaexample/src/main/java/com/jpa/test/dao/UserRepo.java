package com.jpa.test.dao;

import com.jpa.test.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

}