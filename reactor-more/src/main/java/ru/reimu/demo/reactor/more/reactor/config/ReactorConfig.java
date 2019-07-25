package ru.reimu.demo.reactor.more.reactor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import reactor.core.Environment;
import reactor.core.Reactor;
import reactor.core.spec.Reactors;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 16:26
 * @Desc: 实例化Reactor Bean,这里采用内部 Bean 方式实现
 */
@Component
public class ReactorConfig {

    @Bean
    Environment env() {
        return new Environment();
    }

    @Bean
    @Primary
    Reactor pool(Environment env) {
        return Reactors.reactor()
                    .env(env)
                    .dispatcher(Environment.THREAD_POOL)
                    .get();
    }

    @Bean
    Reactor loop(Environment env) {
        return Reactors.reactor()
                    .env(env)
                    .dispatcher(Environment.EVENT_LOOP)
                    .get();
    }
}
