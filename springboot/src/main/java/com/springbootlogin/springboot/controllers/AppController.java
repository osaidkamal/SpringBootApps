package com.springbootlogin.springboot.controllers;

import com.springbootlogin.springboot.models.User;
import com.springbootlogin.springboot.service.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    private UserRepo repo;

    @GetMapping("")
    public String HomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "register";

    }

    @PostMapping("/process_register")
    public String processRegistration(User user) {
        repo.save(user);
        return "success";
    }

    @GetMapping("/list_users")
    public String viewUserList() {
        return "users";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    // @PostMapping("/process-login")
    // public String loginProcess() {
    // return "successLogin";
    // }
}
