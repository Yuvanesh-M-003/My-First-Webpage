package com.example.Valentine.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaForwardController {

    @GetMapping("/countdown/{id}")
    public String forward() {
        return "forward:/index.html";
    }
}
