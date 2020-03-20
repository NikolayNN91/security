package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/string")
    public String getString() {
        return "Hello World!";
    }

    @GetMapping("/")
    public String getStart() {
        return "Hello World!";
    }

    @GetMapping("/secured")
    public String getSecured() {
        return "Hello World!";
    }
}
