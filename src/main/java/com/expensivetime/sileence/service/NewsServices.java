package com.expensivetime.sileence.service;

import com.expensivetime.sileence.mapper.NewsMapper;
import com.expensivetime.sileence.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServices {
    private NewsMapper newsMapper;
    @Autowired
    public NewsServices(NewsMapper newsMapper){
        this.newsMapper = newsMapper;
    }
    public List<News> getNewsList(){
        return newsMapper.getNewsList();
    }

}
