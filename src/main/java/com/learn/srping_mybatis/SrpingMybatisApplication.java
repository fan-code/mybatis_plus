package com.learn.srping_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.learn.srping_mybatis.mapper")
@SpringBootApplication
public class SrpingMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrpingMybatisApplication.class, args);
    }

}
