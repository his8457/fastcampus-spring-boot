package com.example.demo.controller;

import com.example.demo.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/put-api")
public class PutApiController {


    @PutMapping("/put")
    public void put (@RequestBody PutRequestDto request){
        System.out.println(request.toString());
    }

    @PutMapping("/put-object")
    public PutRequestDto putObj (@RequestBody PutRequestDto request){
        return request;
    }

    @PutMapping("/put/{userId}")
    public PutRequestDto putGetParam (@RequestBody PutRequestDto request
                                    , @PathVariable(name = "userId") Long userId){
        System.out.println(userId);
        return request;
    }
}
