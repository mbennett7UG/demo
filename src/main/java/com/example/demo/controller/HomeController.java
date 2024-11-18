package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Handle the root URL and redirect to /petitions
    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/petitions";
    }
}