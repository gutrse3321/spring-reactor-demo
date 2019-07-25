package ru.reimu.demo.reactor.more;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 16:19
 * @Desc:
 */
@SpringBootApplication
@MapperScan("ru.reimu.demo.reactor.more.mapper")
public class MoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoreApplication.class, args);
    }
}
