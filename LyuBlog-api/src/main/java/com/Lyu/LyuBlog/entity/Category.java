package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
*@ClassName: Category
*@Description: 博客分类
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class Category {
    private Long id;
    private String name;//分类名称
    private List<Blog> blogs = new ArrayList<Blog>();//该分类下的博客文章
}
