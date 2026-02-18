package com.java.bala.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bala.curso.entities.OrderItem;
import com.java.bala.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {	
}


