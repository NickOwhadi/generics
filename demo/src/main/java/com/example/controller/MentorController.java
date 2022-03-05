package com.example.controller;

import com.example.enums.Gender;
import com.example.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("list")
    public String showTable(Model model){
//        List<Mentor> mentorList= new ArrayList<>();
//        mentorList.add(new Mentor("Mikies","Smith",45, Gender.MALE));
//        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
//        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));
//
//        model.addAttribute("mentors",mentorList);
        Mentor mentor1=new Mentor("Allalo","Kirian",22,Gender.MALE);
        Mentor mentor2=new Mentor("Zappas","Kirian2",25,Gender.FEMALE);
        Mentor mentor3=new Mentor("Nickian","Kirian3",62,Gender.MALE);
        model.addAttribute("mentor1",mentor1);
        model.addAttribute("mentor2",mentor2);
        model.addAttribute("mentor3",mentor3);

        return "mentor/mentor-list";
    }
}
