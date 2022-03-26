package com.study_pro.service.impl;

import com.study_pro.mapper.UserMapper;
import com.study_pro.service.UserService;
import entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }
}
