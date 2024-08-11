package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }


    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청 !";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "post Method !!!";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT 요청 !!!";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "deleted !!!";
    }
}
