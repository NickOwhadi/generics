package com.example.modelTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String welcome2(Model model){
        model.addAttribute("name","Nick Owhadi");
        model.addAttribute("course","Java Developer");
        return "student/welcome.html";
    }
}
