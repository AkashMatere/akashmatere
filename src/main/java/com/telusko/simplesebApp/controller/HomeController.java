package com.telusko.simplesebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("akash");
        return "Welcome to telusko";
    }
@RequestMapping("/about")
    public String about(){
        return "i am akash";
    }
}
