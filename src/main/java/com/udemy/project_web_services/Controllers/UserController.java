package com.udemy.project_web_services.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.project_web_services.Models.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1, "Matheus", "matheus@gmail.com", "99 9 9999-9999", "12345");

        return ResponseEntity.ok().body(u);
    }
}
