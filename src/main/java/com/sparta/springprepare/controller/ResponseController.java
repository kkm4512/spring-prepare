package com.sparta.springprepare.controller;

import com.sparta.springprepare.model.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    @GetMapping("/json/class")
    @ResponseBody
    public Star helloJsonClass() {
        return new Star("Robbie", 95, "1");
    }
}


