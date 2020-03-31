package com.expencesiveTime.slieence.controller;

import com.expencesiveTime.slieence.service.NewsServices;
import com.expencesiveTime.slieence.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    NewsServices newsServices;
    @RequestMapping("/")
    public String homePage(Model model){
        List<News> newsList= newsServices.getNewsList();
        System.out.println(newsList.get(0).getContent()+"----------内容显示----------");
        model.addAttribute("newsList",newsList);
        return "news";
    }
    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }

    @ExceptionHandler
    public void handleException(){
        System.out.println("出现异常了。。。");
    }
}
