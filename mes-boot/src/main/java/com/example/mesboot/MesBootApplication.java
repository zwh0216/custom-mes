package com.example.mesboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
@MapperScan(
        basePackages = "com.example",
        annotationClass = org.apache.ibatis.annotations.Mapper.class
)
public class MesBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MesBootApplication.class, args);
    }

}
