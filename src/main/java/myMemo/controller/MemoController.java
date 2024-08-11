package myMemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/memos")
public class MemoController {
    @GetMapping("/")
    public String helloWorld() {
        System.out.println("gd");
        return null;
    }
}
