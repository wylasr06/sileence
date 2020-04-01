package com.expensivetime.sileence.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMapperTests {

    @Resource
    private MyMapper myMapper;
    @Test
    public void test(){
        Assert.assertEquals(1,myMapper.addUser("K","K"));
    }
}
