package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    // Day 11
    List<User> findByRole(String role);

    // Day 12 – username + role
    @Query("SELECT u FROM User u WHERE u.username = :username AND u.role = :role")
    List<User> findByUsernameAndRole(String username, String role);
}

