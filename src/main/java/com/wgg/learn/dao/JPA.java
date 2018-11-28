package com.wgg.learn.dao;

import com.wgg.learn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface JPA extends JpaRepository<User, Long> {

    /**
     * @param username:用户姓名
     * @param password:用户密码
     */

    User findByUsernameAndPassword(String username,String password);
}
