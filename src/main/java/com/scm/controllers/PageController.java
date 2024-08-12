package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model mode)
    {   
        mode.addAttribute("name","Rakshil Modi" );
        mode.addAttribute("Springboot Project", "Smart Contact Manager");
        return "Home";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/services")
    public String services(){
        return "services";
    }
}
