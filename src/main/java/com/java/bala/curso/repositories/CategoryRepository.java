package com.java.bala.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bala.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

	
}
