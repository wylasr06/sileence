package com.expencesiveTime.slience.service;

import com.expencesiveTime.slience.mapper.UserMapper;
import com.expencesiveTime.slience.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userDAO;
    public User getUser(int id){
        return userDAO.getUser(id);
    }
}
