package com.expensivetime.sileence.utils;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    private TimeUtils(){}

    /**
     * 1585857937000
     * 1585857937000
     * */
    public static String getTime(){
        try {
          return SimpleDateFormat.getInstance().parse("Fri Apr 03 04:05:37 CST 2020").toString();

//            return FastDateFormat.getInstance("YYYY-MM-dd").parse("Fri Apr 03 04:05:37 CST 2020").toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
   /* public static void main(String[]args){
        System.out.println(getTime());
    }*/
}
