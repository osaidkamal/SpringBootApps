package com.springbootlogin.springboot.service;

import com.springbootlogin.springboot.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Long> {
    @Query("Select u FROM User u WHERE u.email=?1")
    User findByEmail(String email);
}