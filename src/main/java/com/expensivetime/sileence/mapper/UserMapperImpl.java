package com.expensivetime.sileence.mapper;

import com.expensivetime.sileence.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapperImpl {

    @Select("select id,name,password,headUrl from silence.user where name = #{name} and password = #{password}")
    public User getCurrentUser(String name,String password);
    @Select("select name,id,password,headUrl from silence.user where id = #{id}")
    public User getUser(@Param("id") int id);

    @Select("select id,name,headurl,password from silence.user where name = #{name} and password = #{password}")
    public User isRegisteredUser(String name,String password);

    @Insert("insert into silence.user(name,password) values (#{name},#{password})")
    public int register(String name,String password);


}
