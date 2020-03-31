package com.expencesiveTime.slieence.mapper;

import com.expencesiveTime.slieence.model.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {

    @Select("select id,title,content,description,opinions,comments,createdTime,isAvailable from silence.news order by createdTime desc")
    public List<News> getNewsList();


}
