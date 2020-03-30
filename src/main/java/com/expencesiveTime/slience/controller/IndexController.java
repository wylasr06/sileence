package com.expencesiveTime.slience.controller;

import com.expencesiveTime.slience.model.News;
import com.expencesiveTime.slience.service.NewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
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
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
