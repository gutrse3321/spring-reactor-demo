package ru.reimu.demo.springreactordemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("ru.reimu.demo.springreactordemo.pojo.mapper")
public class AppserverDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppserverDemoApplication.class, args);
    }

}
