package com.think.myssmspringboot.service;

import com.think.myssmspringboot.model.User;

public interface IUserService {

    public User selectUser(String username);

}
