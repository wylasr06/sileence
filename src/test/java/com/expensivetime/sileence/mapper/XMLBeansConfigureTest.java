package com.expensivetime.sileence.mapper;

import com.expensivetime.sileence.utils.MyBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XMLBeansConfigureTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-configuration.xml");
        MyBean me = (MyBean) applicationContext.getBean("me");
        Assert.assertEquals("1024", me.getMe());
    }
}
