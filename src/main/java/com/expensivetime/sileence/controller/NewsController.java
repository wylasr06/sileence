package com.expensivetime.sileence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {
    @RequestMapping("/profile")
    public String getProfile(){
        System.out.println("====NewsController.getProfile");
        return "profile";
    }
}
