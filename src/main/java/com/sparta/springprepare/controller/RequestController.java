package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello/request")
public class RequestController {
    @GetMapping("/form/html")
    public String helloForm() {
        return "hello-request-form";
    }

    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) {
        System.out.println(name);
        System.out.println(age);
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
    }

    @GetMapping("/form/param")
    @ResponseBody
    public String helloGetRequestParam(String name, @RequestParam(required = false) int age) {
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
    }

    @PostMapping("/form/param")
    @ResponseBody
    public String helloPostRequestParam(String name, int age) {
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
    }


}
