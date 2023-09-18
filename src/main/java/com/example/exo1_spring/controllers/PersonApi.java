package com.example.exo1_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/index")
public class PersonApi {

    @GetMapping
    public String getPerson() {
        return "ammari ikhlasse";
    }

    @GetMapping(value = "persons")
    public List<String> getPersons() {
        return List.of("me", "hello", "coucou");
    }

}
