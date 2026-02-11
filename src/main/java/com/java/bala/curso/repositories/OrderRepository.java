package com.java.bala.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bala.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

	
}
