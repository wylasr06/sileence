package com.expencesiveTime.slieence.controller;

import com.alibaba.fastjson.JSON;
import com.expencesiveTime.slieence.model.User;
import com.expencesiveTime.slieence.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, HttpSession session){
        session.setAttribute("token", UUID.randomUUID());
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new User(name,password);
        User u = userService.isRegisteredUser(user);
        if(u != null){
            return JSON.toJSONString(u);
        }else{
            int registerCode = userService.register(user);
            if(registerCode > 0){
                return JSON.toJSONString(userService.isRegisteredUser(user));
            }else{
                return "UnexpectedException";
            }
        }

        /*System.out.println(request.getParameter("name")+"用户名");
        System.out.println(request.getParameter("password")+"密码");*/
    }
}
