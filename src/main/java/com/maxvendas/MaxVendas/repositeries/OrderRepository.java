package com.maxvendas.maxvendas.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxvendas.maxvendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> 
{

	
}
