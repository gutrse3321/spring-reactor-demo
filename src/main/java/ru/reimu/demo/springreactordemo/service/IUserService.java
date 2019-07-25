package ru.reimu.demo.springreactordemo.service;

import ru.reimu.demo.springreactordemo.pojo.dto.UserDto;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 15:40
 * @Desc:
 */
public interface IUserService {

    UserDto getUser(Integer uid);
}
