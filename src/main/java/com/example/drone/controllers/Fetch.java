package com.example.drone.controllers;

import com.example.drone.dto.GasValueDto;
import com.example.drone.models.GasValue;
import com.example.drone.repositories.GasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/apis")
@CrossOrigin
public class Fetch {

    @Autowired
    private GasRepository gasRepository;

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("hello world", HttpStatus.valueOf(200));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(gasRepository.findAll(), HttpStatus.valueOf(200));
    }

    @PostMapping("/upload")
    public ResponseEntity<?> setGas(@RequestBody GasValueDto dto) {
        return new ResponseEntity<>(gasRepository.save(new GasValue(dto)), HttpStatus.OK);
    }

}
