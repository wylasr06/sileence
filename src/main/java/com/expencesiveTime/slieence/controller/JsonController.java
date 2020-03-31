package com.expencesiveTime.slieence.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class JsonController {
    @RequestMapping("/json")
    @ResponseBody
    public String getJsonData(){
        Map<String,String> map = new HashMap<>();
        map.put("name","小明");
        map.put("age",""+12);
        return JSON.toJSONString(map);
    }
}
