package com.smidms.service1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service1")
public class Controller {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getMessage() {
        return "Hi, we are from server 1";
    }

}