package com.learn.srping_mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.srping_mybatis.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> getUserListByCondition(String name);
}
