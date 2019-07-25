package ru.reimu.demo.reactor.more.reactor.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.event.Event;
import ru.reimu.demo.reactor.more.mapper.ArticleMapper;
import ru.reimu.demo.reactor.more.reactor.BaseHandler;
import ru.reimu.demo.reactor.more.dto.ArticleDto;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 16:31
 * @Desc:
 */
@Slf4j
@Component
public class ArticleHandler extends BaseHandler<ArticleDto> {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    protected void handler(ArticleDto articleDto, Event<ArticleDto> articleDtoEvent) {

        try {
            ArticleDto article = articleMapper.getArticle(articleDto.getId());
            log.info("in ArticleHandler: article={}", article);
        } catch(Exception e) {
            log.error(String.valueOf(e));
        }
    }
}
