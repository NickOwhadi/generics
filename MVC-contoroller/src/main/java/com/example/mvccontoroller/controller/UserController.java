package com.example.mvccontoroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/kir")
    public String home(){
        return "User/user.html";
    }
}
