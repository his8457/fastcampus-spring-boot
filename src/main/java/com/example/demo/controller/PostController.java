package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/post-api")
public class PostController {

    @RequestMapping("/post-param")
    public void post(@RequestBody Map<String, Object> requestData) {
        for(String key : requestData.keySet()){
            System.out.println("key : " + key + " , value : " + requestData.get(key));
        }
    }

    @RequestMapping("/post-dto")
    public void postDto(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData.toString());
    }
}
