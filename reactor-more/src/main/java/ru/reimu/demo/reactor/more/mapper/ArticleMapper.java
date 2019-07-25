package ru.reimu.demo.reactor.more.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ru.reimu.demo.reactor.more.dto.ArticleDto;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 17:34
 * @Desc:
 */
@Repository
public interface ArticleMapper {

    ArticleDto getArticle(@Param("artId") Integer artId);
}
