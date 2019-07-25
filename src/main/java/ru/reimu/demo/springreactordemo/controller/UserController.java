package ru.reimu.demo.springreactordemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.Reactor;
import reactor.event.Event;
import ru.reimu.demo.springreactordemo.pojo.dto.UserDto;
import ru.reimu.demo.springreactordemo.service.IUserService;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 14:21
 * @Desc:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Reactor reactor;

    @Autowired
    IUserService userService;

    @PostMapping("/get")
    public UserDto getUser(Integer uid) {

        UserDto userDto = new UserDto();
        userDto.setId(uid);

        reactor.notify("userHandler", Event.wrap(userDto));
        return userService.getUser(uid);
    }
}
