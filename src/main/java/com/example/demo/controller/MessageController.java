package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @GetMapping("/msg")
    public String showMessage(Model model)
    {
        String Name = "name";

        model.addAttribute("attr", Name);


        return "MessagePage";
    }
}
