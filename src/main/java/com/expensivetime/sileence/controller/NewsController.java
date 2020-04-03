package com.expensivetime.sileence.controller;

import com.alibaba.fastjson.JSON;
import com.expensivetime.sileence.model.News;
import com.expensivetime.sileence.model.User;
import com.expensivetime.sileence.service.NewsServices;
import com.expensivetime.sileence.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsServices newsServices;

    @Autowired
    private UserService userService;

    @RequestMapping("/profile")
    public String getProfile(Model model){
        List<News> newsList = newsServices.getNewsList(userService.getUser(1));
        model.addAttribute("newsList",newsList);
        System.out.println("====NewsController.getProfile : "+ JSON.toJSONString(newsList));
        return "profile";
    }
}
