package com.smidms.service2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service2")
public class Controller {

    @GetMapping("hello")
    @ResponseStatus(HttpStatus.OK)
    public String getMessage(){
        return "Hi, i am from service2";
    }

}
