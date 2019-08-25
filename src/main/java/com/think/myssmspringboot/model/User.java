package com.think.myssmspringboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
由于Lombok插件的原因只需要
@Data：生成所有，getter() setter() toString()等等方法
@Setter ：生成setter()方法
@Getter：生成getter()方法
*/
@Data
public class User {

    @Setter @Getter
    private long id;
    @Setter @Getter
    private String email;
    @Setter @Getter
    private String mobile;
    @Setter @Getter
    private String username;
    @Setter @Getter
    private String role;
}
