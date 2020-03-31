/*
package com.expencesiveTime.slience.controller;

import org.apache.el.lang.EvaluationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.Enumeration;
import java.util.Map;

@Controller
public class HelloSpringBoot {

    @RequestMapping(value = {"/","index"})
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/parameter/{key}")
    @ResponseBody
    public String getParam(@PathVariable("key") String key,
                           @PathParam(value = "name")String name,
                           HttpServletRequest request,
                           HttpServletResponse response){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(key);
        stringBuilder.append("\n"+name);
        stringBuilder.append("请求端编码格式：\n"+request.getParameter("key")+request.getCharacterEncoding());
        stringBuilder.append("\n"+response.getCharacterEncoding());
        return stringBuilder.toString();
    }

}
*/
