package com.eliehome.staffmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingsController {
    @GetMapping("/")
    public String greetingsController(){
        return "Welcome to Staff Management";
    }
}
