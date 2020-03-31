package com.expensivetime.sileence.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Before("execution(public * com.expensivetime.sileence.mapper.UserMapper.*(..))")
    public void beforeExecute(JoinPoint joinPoint){
        System.out.println("before function execute : "+ JSON.toJSONString(joinPoint.getSignature()));
    }
    @After("execution( public * com.expencesiveTime.sileence.mapper.*.*(..))")
    public void afterExecute(){
        System.out.println("after function execute ---");
    }
}
