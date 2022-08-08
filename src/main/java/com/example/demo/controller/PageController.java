package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    //String으로 페이지 객체 Response로 보내기
    @RequestMapping("/return-page")
    public String pageObject(){
        return "main.html";
    }

    //@ResponseBody 를 사용하여 Response를 보낼때 Object를 JSON 으로 보낸다.
    @ResponseBody
    @GetMapping("/user")
    public UserRequest responseBody(){
        var user = new UserRequest();
        user.setName("ishwang");
        user.setAge(39);
        return user;
    }
}
