package ru.reimu.demo.springreactordemo.reactor.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.event.Event;
import ru.reimu.demo.springreactordemo.pojo.dto.UserDto;
import ru.reimu.demo.springreactordemo.pojo.mapper.UserMapper;

import reactor.function.Consumer;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 15:00
 * @Desc: 事件的监听器，以便于接收发送的事件并处理。需要实现 Consumer<Event<T>> 接口，其中 T 是处理程序接收的数据类型，要根据具体业务设置
 */
@Slf4j
@Component
public class UserHandler implements Consumer<Event<UserDto>> {

    @Autowired
    UserMapper userMapper;

    @Override
    public void accept(Event<UserDto> userDtoEvent) {

        try {
            UserDto user = userDtoEvent.getData();
            user = userMapper.getUser(user.getId());
            log.info("in userHandler: user={}", user);
        } catch(Exception e) {
            log.error(String.valueOf(e));
        }
    }
}
