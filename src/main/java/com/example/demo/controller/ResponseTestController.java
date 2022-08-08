package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/response/")
public class ResponseTestController {

    //String
    @RequestMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    //Request 실행순서 :  Object mapper -> Object -> method -> object -> Object mapper -> JSON -> response
    @RequestMapping("/json")
    public UserRequest json(@RequestBody UserRequest user){
        return user;
    }

    //ResponseEntity
    @RequestMapping("/put")
    public ResponseEntity<UserRequest> put (@RequestBody UserRequest user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


}
