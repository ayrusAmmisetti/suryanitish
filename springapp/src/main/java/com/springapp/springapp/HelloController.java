package com.springapp.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping()
    String getHomePage(Model model) {
        return "index";
    }

    @RequestMapping(value = "/register")
    String getRegistrationPage() {
        return "register";
    }
}
