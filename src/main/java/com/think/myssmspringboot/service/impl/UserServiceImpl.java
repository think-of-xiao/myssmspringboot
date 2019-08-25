package com.think.myssmspringboot.service.impl;

import com.think.myssmspringboot.dao.IUserDao;
import com.think.myssmspringboot.model.User;
import com.think.myssmspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    //依赖注入
    @Autowired
    private IUserDao userDao;

    @Override
    public User selectUser(String username) {
        return userDao.selectUser(username);
    }
}
