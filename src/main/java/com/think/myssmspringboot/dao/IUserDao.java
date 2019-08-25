package com.think.myssmspringboot.dao;

import com.think.myssmspringboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface IUserDao {

    User selectUser(String username);
}
