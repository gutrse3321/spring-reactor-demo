package ru.reimu.demo.springreactordemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reimu.demo.springreactordemo.pojo.dto.UserDto;
import ru.reimu.demo.springreactordemo.pojo.mapper.UserMapper;
import ru.reimu.demo.springreactordemo.service.IUserService;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 15:41
 * @Desc:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto getUser(Integer uid) {

        return userMapper.getUser(uid);
    }
}
