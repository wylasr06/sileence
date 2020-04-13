package com.expensivetime.sileence.service;

import com.expensivetime.sileence.model.User;
import com.expensivetime.sileence.mapper.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapperImpl userDAO;
    @Autowired
    public UserService(UserMapperImpl userDAO){
        this.userDAO = userDAO;
    }
    public User getCurrentUser(String name,String password){
        return userDAO.getCurrentUser(name,password);
    }
    public User getUser(int id){
        return userDAO.getUser(id);
    }
    public User isRegisteredUser(User user){
        return userDAO.isRegisteredUser(user.getName(),user.getPassword());
    }
    public int register(User user){
        return userDAO.register(user.getName(),user.getPassword());
    }
}
