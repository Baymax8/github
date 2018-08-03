package com.test.service;


import com.test.bean.User;
import com.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fhd on 2018/7/23.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getMessage(Long uid){
        return  userMapper.selectByPrimaryKey(uid);
    }
    public User findUser(String userName){
        return userMapper.selectByUserName(userName);
    }
    public void updateUserMessage(User user){
        userMapper.updateByPrimaryKey(user);
    }
}
