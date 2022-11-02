package com.rpg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.rpg.mapper"})
public class RpjApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpjApplication.class, args);
    }

}
