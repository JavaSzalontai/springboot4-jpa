package com.java.bala.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bala.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

	
}
