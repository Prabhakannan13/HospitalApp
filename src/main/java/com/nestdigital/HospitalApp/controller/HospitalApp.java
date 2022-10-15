package com.nestdigital.HospitalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HospitalApp {

    @GetMapping("/")
    public String Home(){
        return "Welcome to hospital home page";
    }
    @GetMapping("/add")
    public String adduser(){
        return "Welcome to adduser";
    }
    @GetMapping("/search")
    public String searchuser(){
        return "welcome to search page";
    }
    @GetMapping("/delete")
    public String deleteuser(){
        return "welcome to delete page";
    }
    @GetMapping("/logout")
    public String logout(){
        return "Redirected to logout page";
    }
}
