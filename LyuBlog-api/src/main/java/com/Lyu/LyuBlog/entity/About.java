package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*@ClassName: About
*@Description: 关于我
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class About {
    private Long id;
    private String nameEn;
    private String nameZh;
    private String value;
}
