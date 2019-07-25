package ru.reimu.demo.springreactordemo.reactor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 14:44
 * @Desc: 实例化Reactor Bean,这里采用内部 Bean 方式实现
 */
@Configuration
public class ReactorConfig {

    /**
     * 实例化环境上下文，注入到Bean
     * @return
     */
    @Bean
    Environment env() {

        return new Environment();
    }

    @Bean
    Reactor createReactor(Environment env) {

        return Reactors.reactor()
                    .env(env)
                    .dispatcher(Environment.THREAD_POOL)
                    .get();
    }
}
