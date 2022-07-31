package com.example.demo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "heelo spring boot";
    }

    @GetMapping("/test")
    public String test(@ModelAttribute ModelMap map){
        map.addAttribute("firstName", "hwang");
        return "index";
    }
}
