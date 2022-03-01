package com.smartcontact.smartcontactmanager.Dao;

import com.smartcontact.smartcontactmanager.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.email=:email")
    public User getUserByUserName(@Param("email") String email);
}
