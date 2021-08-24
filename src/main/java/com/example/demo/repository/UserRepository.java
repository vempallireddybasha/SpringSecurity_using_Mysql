package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entirty.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	//@Query("select u from User u where u.userName=:username")
	 public User findByUserName(String username);
}
