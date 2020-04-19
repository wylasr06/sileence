package com.expensivetime.sileence.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.expensivetime.sileence.model.News;
import com.expensivetime.sileence.model.User;
import com.expensivetime.sileence.service.NewsServices;
import com.expensivetime.sileence.service.UserService;
import com.expensivetime.sileence.utils.TimeUtils;
//import com.expensivetime.sileence.utils.UserTracker;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.sql.Date;
import java.util.*;

@Controller
public class NewsController {

    private static final String FILE_PATH = "F:\\idea\\workspace\\sileence\\src\\main\\resources\\static\\pictures";
    @Autowired
    private NewsServices newsServices;

    @Autowired
    private UserService userService;

    @RequestMapping("/profile")
    public String getProfile(Model model){
        System.out.println("/profile当前线程名"+Thread.currentThread().getName());
        List<News> newsList = newsServices.getNewsList(userService.getUser(1));
        model.addAttribute("newsList",newsList);
        System.out.println("====NewsController.getProfile : "+ JSON.toJSONString(newsList));
        return "profile";
    }

    @RequestMapping(value = "/releaseNews",method = RequestMethod.POST,consumes="application/json")
    @ResponseBody
    public String upload(@RequestBody Map jsonData){
        System.out.println("/releaseNews当前线程名"+Thread.currentThread().getName());
        System.out.println("新闻内容 ： "+jsonData.get("content"));
        System.out.println("图片的base64是个什么鬼？ ： "+jsonData.get("img"));
        String img = jsonData.get("img").toString().replace("data:image/jpeg;base64,","");
        System.out.println("base64去掉了图片类型 ： "+img);

        byte[] base64Img = Base64.getDecoder().decode(img);
        OutputStream os = null;
        File file = null;
        String fileName = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println("upload文件名称 ： "+fileName);
        try {
            file = new File(FILE_PATH+"/"+fileName+".jpeg");
            os = new FileOutputStream(file);
            os.write(base64Img);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /**
         * 写入数据库，并将新的记录返回到前端
*/
//        User user = UserTracker.getCurrentUser();
//        System.out.println("为什么获取不到呢？？？ "+user.getId()+" , "+user.getName());
        User user = userService.getUser(1);
        String title = jsonData.get("content").toString().substring(0,10);
        News news = new News(title,jsonData.get("content").toString(),fileName,0,0, new Date(System.currentTimeMillis()),"0",user.getId());
        newsServices.releaseNews(news,user.getId());
        //List<News> newsList = newsServices.getNewsList(user);
        Map<String,String> fields = new HashMap<>();
        fields.put("hello","world");
        fields.put("Mr","Anderson");
        fields.put("龙井","感谢");
        JSONObject data = new JSONObject();
        data.put("result",fields);
        List<Map> list = new LinkedList<>();
        list.add(fields);   //mmm
        String Json = JSON.toJSONString("{\"list\":"+ JSON.toJSONString(list)+"}");
        return data.toString();
        
    }
}
