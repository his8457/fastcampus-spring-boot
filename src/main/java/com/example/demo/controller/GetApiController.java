package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    // http://localhost:8188/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);
        return name;
    }

    // http://localhost:8188/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    // Get Parameter @RequestParam Map으로 받기
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();
         queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = " + entry.getValue() + "\n");
         });

         return sb.toString();
    }
    
    //Get parameter VO로 받기
    @GetMapping(path="query-param-vo")
    public String queryParamForVo(UserRequest user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());

        return user.toString();
    }
}
