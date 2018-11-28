package com.wgg.learn.dao;

import com.wgg.learn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Mybatis {

    /**
     * 使用用户名密码获取账号信息
     *
     * @param username :用户名
     * @param password:密码
     * @return User
     */

    User findByUserNameAndPassword(@Param("username") String username, String password);
}
