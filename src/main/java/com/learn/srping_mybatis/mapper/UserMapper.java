package com.learn.srping_mybatis.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.srping_mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where name= 'Tom' ")
    List<User> findUserByName(@Param("name")  String name);
}
