package com.example.exo1_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class Person {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/persons/person1")
    public String personName(Model model) {
        model.addAttribute("firstName", "me");
        model.addAttribute("lastName", "hello");
        return "/persons/person1";
    }
    @RequestMapping(value = "/persons/person2")
    public String personName2(Model model) {
        model.addAttribute("firstName", "mchicha");
        model.addAttribute("lastName", "miaou");
        return "/persons/person2";
    }

    @RequestMapping(value = "/persons/list")
    public String list(Model model) {
        List<String> persons = List.of("John DUPONT", "Maria DUPONT", "Chloée SMITH");
        model.addAttribute("persons", persons);
        return "/persons/list";
    }
}
