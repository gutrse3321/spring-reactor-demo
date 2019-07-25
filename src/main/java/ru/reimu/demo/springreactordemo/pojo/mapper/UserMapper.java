package ru.reimu.demo.springreactordemo.pojo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ru.reimu.demo.springreactordemo.pojo.dto.UserDto;


/**
 * @Author: Tomonori
 * @Date: 2019/7/25 15:05
 * @Desc:
 */
@Repository
public interface UserMapper {

    UserDto getUser(@Param("uid") Integer uid);
}
