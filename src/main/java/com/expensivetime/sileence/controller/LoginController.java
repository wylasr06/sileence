package com.expensivetime.sileence.controller;

import com.alibaba.fastjson.JSON;
import com.expensivetime.sileence.model.User;
import com.expensivetime.sileence.service.UserService;
import com.expensivetime.sileence.utils.UserTracker;
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

    @RequestMapping("/logout")
    public String logout(){
        UserTracker.setCurrentUser(null);
        return "redirect:/";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, HttpSession session){
        System.out.println("/login开始当前线程名"+Thread.currentThread().getName());
        session.setAttribute("token", UUID.randomUUID());
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new User(name,password);
        User u = userService.isRegisteredUser(user);
        if(u != null){
            UserTracker.setCurrentUser(userService.getCurrentUser(name,password));
            System.out.println("name : "+name+" password : "+password+" 已注册");
            System.out.println("login当前线程名"+Thread.currentThread().getName());
            return JSON.toJSONString(u);
        }else{
            int registerCode = userService.register(user);
            System.out.println("name : "+name+" password : "+password+" 没有注册");
            if(registerCode > 0){
                UserTracker.setCurrentUser(userService.getCurrentUser(name,password));
                return JSON.toJSONString(userService.isRegisteredUser(user));
            }else{
                return "UnexpectedException";
            }
        }

        /*System.out.println(request.getParameter("name")+"用户名");
        System.out.println(request.getParameter("password")+"密码");*/
    }
}
