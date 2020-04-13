package com.expensivetime.sileence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicClassTests {

    @Test
    public void testString(){
        String name = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(name);
        System.out.println(name.substring(0,10));
    }
}
