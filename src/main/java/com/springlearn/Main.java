package com.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication //declare it as spring boot application
@RestController
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet(){
        return new GreetResponse("Hello",
                List.of("Java","Cpp","JavaScript"),
                new Person("Emran")
                );
    }

    record Person(String name){

    }

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
            ){

    }
}
