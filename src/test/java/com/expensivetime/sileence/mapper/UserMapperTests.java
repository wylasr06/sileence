package com.expensivetime.sileence.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void isRegisteredUserTest(){
        assertEquals("Smith",userMapper.isRegisteredUser("Smith","aeiou").getName());
        System.out.println(userMapper.isRegisteredUser("Smith","aeiou").getName()+" , password");
        assertEquals("aeiou",userMapper.isRegisteredUser("Smith","aeiou").getPassword());
    }

    /**
     * SpringBoot-version : 2.1.1.BUILD-SNAPSHOT
     * @Transactional 回滚测试数据造成的数据更新
     */
    @Test
    @Transactional
    public void registerTest(){
        assertEquals(1,userMapper.register("Anderson","password"));
    }

}
