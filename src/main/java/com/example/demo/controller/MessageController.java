package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/msg")
    public String showMessage(Model model)
    {
        String Name = "name";

        model.addAttribute("attr", Name);


        return Name;
    }
}
