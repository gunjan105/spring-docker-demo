package com.base.example.controller;

import com.base.example.repo.UserRepo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    private final Log logger = LogFactory.getLog(getClass());

    @GetMapping("/users")
    public ResponseEntity<Object> users(){
        logger.debug("xyz");
        return ResponseEntity.ok(userRepo.findAll());
    }
}
