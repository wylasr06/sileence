package com.expencesiveTime.slience.service;

import com.expencesiveTime.slience.mapper.NewsMapper;
import com.expencesiveTime.slience.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServices {
    @Autowired
    NewsMapper newsMapper;
    public List<News> getNewsList(){
        return newsMapper.getNewsList();
    }

}
