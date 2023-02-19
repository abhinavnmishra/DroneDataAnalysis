package com.example.drone.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class Fetch {

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("hello world", HttpStatus.valueOf(200));
    }

}
