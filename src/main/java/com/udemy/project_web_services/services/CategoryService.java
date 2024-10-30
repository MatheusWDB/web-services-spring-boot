package com.udemy.project_web_services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.project_web_services.entities.Category;
import com.udemy.project_web_services.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
    
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return (obj.get());
    }
}
