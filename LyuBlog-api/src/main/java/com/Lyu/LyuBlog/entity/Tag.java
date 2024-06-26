package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
*@ClassName: Tag
*@Description: 博客标签
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class Tag {
    private Long id;
    private String name;//标签名称
    private String color;//标签颜色(与Semantic UI提供的颜色对应，可选)
    private List<Blog> blogs = new ArrayList<>();//该标签下的博客文章
}
