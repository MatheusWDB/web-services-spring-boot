package com.udemy.project_web_services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.project_web_services.entities.Product;
import com.udemy.project_web_services.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return (obj.get());
    }
}
