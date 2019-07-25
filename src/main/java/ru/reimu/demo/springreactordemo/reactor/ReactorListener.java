package ru.reimu.demo.springreactordemo.reactor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.Reactor;
import ru.reimu.demo.springreactordemo.reactor.handler.UserHandler;

import static reactor.event.selector.Selectors.$;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 15:14
 * @Desc:
 */
@Component
public class ReactorListener implements InitializingBean {

    @Autowired
    Reactor reactor;

    @Autowired
    UserHandler userHandler;

    @Override
    public void afterPropertiesSet() throws Exception {

        reactor.on($("userHandler"), userHandler);
    }
}
