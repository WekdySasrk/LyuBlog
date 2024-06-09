package com.Lyu.LyuBlog.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class TagBlogCount {
    private Long id;
    private String name;//标签名
    private Integer value;//标签下博客数量

}
