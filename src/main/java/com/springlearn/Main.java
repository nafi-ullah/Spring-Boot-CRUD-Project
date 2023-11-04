package com.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication //declare it as spring boot application
@RestController
@RequestMapping("api/v1/persons")
public class Main {

    private final PersonRepository personRepository;

    public Main(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

   @GetMapping
    public List<Person> getPerson(){
        return personRepository.findAll();
   }
}
