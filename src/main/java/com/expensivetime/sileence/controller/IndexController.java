package com.expensivetime.sileence.controller;

import com.expensivetime.sileence.service.NewsServices;
import com.expensivetime.sileence.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
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
