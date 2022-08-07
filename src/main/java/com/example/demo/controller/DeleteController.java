package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/del-api")
public class DeleteController {

    @RequestMapping("/delete/{userId}")
    public void delete(@PathVariable String userId,
                       @RequestParam String account ) {
        System.out.println(userId);
        System.out.println(account);
    }
}
