package ru.reimu.demo.reactor.more.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reimu.demo.reactor.more.mapper.ArticleMapper;
import ru.reimu.demo.reactor.more.reactor.handler.ArticleHandler;
import ru.reimu.demo.reactor.more.dto.ArticleDto;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 16:22
 * @Desc:
 */
@RestController
@Slf4j
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleHandler articleHandler;

    @Autowired
    ArticleMapper articleMapper;

    @PostMapping("/get")
    public ArticleDto getArticle(Integer artId) {

        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(artId);
        ArticleDto article = articleMapper.getArticle(artId);
        log.info("in ArticleController");
        articleHandler.notify(articleDto);
        log.info("in ArticleController: article={}", article);

        return article;
    }
}
