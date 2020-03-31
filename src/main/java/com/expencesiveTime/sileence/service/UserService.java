package com.expencesiveTime.sileence.service;

import com.expencesiveTime.sileence.model.User;
import com.expencesiveTime.sileence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userDAO;
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
