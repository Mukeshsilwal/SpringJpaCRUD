package com.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
