package com.example.demo.controller;

import com.example.demo.model.Clazz;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping
    public ResponseEntity<Iterable<Clazz>> findAll() {
        return new ResponseEntity<>(classService.findAll(), HttpStatus.OK);
    }
}
