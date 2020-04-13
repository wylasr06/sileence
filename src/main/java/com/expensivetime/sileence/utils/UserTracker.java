package com.expensivetime.sileence.utils;

import com.expensivetime.sileence.model.User;

public class UserTracker {
    private static ThreadLocal<User> whoAmI = new ThreadLocal<User>();

    public static User getCurrentUser(){
        System.out.println(whoAmI.get().getName()+"获取当前用户状态 "+whoAmI.get().getId());
        return whoAmI.get();
    }
    public static void setCurrentUser(User user){
//        if(null == user){
//            whoAmI.remove();
//            return;
//        }
        whoAmI.set(user);
        System.out.println("更新当前用户状态 ： "+whoAmI.get().getId());
    }
}
