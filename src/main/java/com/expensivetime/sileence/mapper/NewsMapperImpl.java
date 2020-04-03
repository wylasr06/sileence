package com.expensivetime.sileence.mapper;

import com.expensivetime.sileence.model.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapperImpl {

    @Select("select id,title,content,description,opinions,comments,createdTime,isAvailable,userId from silence.news order by createdTime desc")
    List<News> getNewsList();

    @Select("select id,title,content,description,opinions,comments,createdTime,isAvailable from silence.news where userId = #{userId} order by createdTime desc")
    List<News> getNewsListById(int userId);

}
