package com.learn.srping_mybatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learn.srping_mybatis.entity.User;
import com.learn.srping_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping ("/getUserInfo")
    public User getUserInfo(Integer userId) {
        User user = userService.getById(userId);
        return user;
    }

    @GetMapping("/getUserListByAgeLimit")
    public List<User> getUserListByAgeLimit() {
        System.out.println("getUserListByAgeLimit 执行");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().gt(User::getAge, 20);
        queryWrapper.lambda().lt(User::getAge, 25);
        List<User> userList = userService.list(queryWrapper);
        return userList;
    }

    @GetMapping("/getUserListBySql")
    public List<User> getUserListBySql(String name) {
        System.out.println(name);
        List<User> userList = userService.getUserListByCondition(name);
        return userList;
    }

}
