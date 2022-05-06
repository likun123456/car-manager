package com.bruce.carmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan(basePackages = "com.bruce.carmanager.mapper")
public class CarManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarManagerApplication.class, args);
    }

}
