package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!!";
    }


}
