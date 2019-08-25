package com.think.myssmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication //声明这是SpringBoot启动类
@EnableTransactionManagement //开始事务管理
public class MyssmspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyssmspringbootApplication.class, args);
    }

}
