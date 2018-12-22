package com.blob.service.impl;

import com.blob.entity.User;
import com.blob.mapper.UserMapper;
import com.blob.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/22 19:51
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public boolean checkUserPwd(User user, String password) {
        if(password.equals(user.getUserPwd())){
            return true;
        }else{
            return false;
        }
    }
}
