package com.expensivetime.sileence.service;

import com.expensivetime.sileence.mapper.NewsMapperImpl;
import com.expensivetime.sileence.model.News;
import com.expensivetime.sileence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServices {
    private NewsMapperImpl newsMapper;
    @Autowired(required = false)
    public NewsServices(NewsMapperImpl newsMapper){
        this.newsMapper = newsMapper;
    }
    public List<News> getNewsList(){
        return newsMapper.getNewsList();
    }

    public List<News> getNewsList(User user){
        return newsMapper.getNewsListById(user.getId());
    }
}
