package com.java.bala.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bala.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	
}
