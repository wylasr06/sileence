package com.expensivetime.sileence.mapper;

import com.expensivetime.sileence.model.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {

    @Select("select id,title,content,description,opinions,comments,createdTime,isAvailable from silence.news order by createdTime desc")
    List<News> getNewsList();


}
