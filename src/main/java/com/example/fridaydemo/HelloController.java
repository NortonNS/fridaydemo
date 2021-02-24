package com.example.fridaydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {
    int testInt = 0;

    @RequestMapping("/")
    public String index() {
        return "Greetings, I'm Glad It's FRIDAY!";
    }
}
