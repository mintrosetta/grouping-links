package com.persotools.groupinglink.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    
    @GetMapping("")
    public String getHelloWorldPage(Model model) {
        LocalDateTime dateTime = LocalDateTime.now();

        model.addAttribute("currentDate", dateTime.toString());

        return "helloworld";
    }

}
