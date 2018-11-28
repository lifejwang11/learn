package com.wgg.learn.Service;

import com.wgg.learn.dao.JPA;
import com.wgg.learn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JPA jpa;

    @Override
    public boolean isExist(@Param("username") String username, @Param("password") String password) {
        System.out.println(username+password);
        User us=jpa.findByUsernameAndPassword(username,password);
        if(us==null){
            return  false;
        }else{
            return true;
        }
    }

}
