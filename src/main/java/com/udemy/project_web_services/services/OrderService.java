package com.udemy.project_web_services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.project_web_services.entities.Order;
import com.udemy.project_web_services.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }
    
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return (obj.get());
    }
}
