package com.example.Deploy02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @GetMapping("")
    public int sum(@RequestParam int x, @RequestParam int y){
        return x + y;
    }
}