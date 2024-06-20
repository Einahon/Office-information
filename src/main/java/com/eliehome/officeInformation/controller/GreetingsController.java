package com.eliehome.officeInformation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingsController {
    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/")
    public String greetingsController() {
        return welcomeMessage;
    }
}
