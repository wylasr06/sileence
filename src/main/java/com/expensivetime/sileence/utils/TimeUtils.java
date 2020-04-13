package com.expensivetime.sileence.utils;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TimeUtils {
    private TimeUtils(){}

    /**
     * 1585857937000
     * 1585857937000
     * */
    public static String getCreatedTime(){
        String createdTime = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss").format(new Date());
        return createdTime;
    }

/*   public static void main(String ...args){
       String fileName = UUID.randomUUID().toString().replace("-","");
       System.out.println(fileName+"在举杯祝福后都走散。"+fileName.length());

       System.out.println(createdTime+" 沉默着懂得我的委屈");
   }*/
}
