package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DadJokesController {
    @GetMapping("/api")
    public String dadJokes() {
        return "Justice is a dish best served cold, if it were served warm it would be just water.";
    }
}
