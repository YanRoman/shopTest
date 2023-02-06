package com.example.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/saved")
    public String saved(){return "saved";}
    @GetMapping("/account")
    public String account(){return "account";}
}
