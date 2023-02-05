package com.example.shop.controllers;

import com.example.shop.entities.User;
import com.example.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/login")
    public String login(){
        return "/login";
    }
    @GetMapping("/registration")
    public String registration(){
        return "/registration";
    }
    @PostMapping("/registration")
    public String addUser(User user, Model model){
        if (!userService.saveUser(user)){
            model.addAttribute("message", "Пользователь с таким именем уже существует");
            return "registration";
        }
        return "redirect:/login";
    }
}
