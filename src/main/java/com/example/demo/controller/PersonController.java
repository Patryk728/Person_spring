package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
private PersonRepository personRepository;

    @GetMapping("/persons")
    public Iterable<Person> myPeople(){
        return personRepository.findAll();
    }

}
