package com.example.cutebunny;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "");
        return "index";
    }

    @PostMapping("/message")
    public String handleMessage(@RequestParam("text") String text, Model model) {
        model.addAttribute("message", text == null ? "" : text.trim());
        return "index";
    }
}
