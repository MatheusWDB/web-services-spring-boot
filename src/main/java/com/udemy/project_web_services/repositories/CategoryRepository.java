package com.udemy.project_web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.project_web_services.entities.Category;
import com.udemy.project_web_services.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
