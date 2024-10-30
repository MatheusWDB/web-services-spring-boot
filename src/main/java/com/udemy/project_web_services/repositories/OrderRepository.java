package com.udemy.project_web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.project_web_services.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
