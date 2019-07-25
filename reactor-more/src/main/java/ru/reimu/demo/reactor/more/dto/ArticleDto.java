package ru.reimu.demo.reactor.more.dto;

import lombok.Data;

/**
 * @Author: Tomonori
 * @Date: 2019/7/25 16:23
 * @Desc:
 */
@Data
public class ArticleDto {

    private Integer id;
    private Integer tag_id;
    private String title;
    private String description;
    private String content;
    private Long created_on;
    private String created_by;
    private Long modified_on;
    private String modified_by;
    private Integer state;
}
