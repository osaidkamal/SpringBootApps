package com.smartcontact.smartcontactmanager.controller;

import java.security.Principal;

import com.smartcontact.smartcontactmanager.Dao.UserRepo;
import com.smartcontact.smartcontactmanager.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @RequestMapping("/index")
    public String dashborad(Model model, Principal principal) {
        String userName = principal.getName();
        System.out.println(userName);
        User user=userRepo.getUserByUserName(userName);
        model.addAttribute("user",user);
        System.out.println(user);
        return "normal/user_dashboard";

    }

}
