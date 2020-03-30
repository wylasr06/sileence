package com.expencesiveTime.slience.mapper;

import com.expencesiveTime.slience.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {

    @Select("select name from silence.user where id = #{id}")
    public User getUser(@Param("id") int id);
}
