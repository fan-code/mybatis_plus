package com.learn.srping_mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.srping_mybatis.entity.User;
import com.learn.srping_mybatis.mapper.UserMapper;
import com.learn.srping_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserListByCondition(String name) {
        return userMapper.findUserByName(name);
    }
}
