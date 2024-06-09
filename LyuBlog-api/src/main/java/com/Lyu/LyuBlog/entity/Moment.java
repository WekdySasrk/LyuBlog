package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
*@ClassName: Moment
*@Description: 博客动态
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class Moment {
    private Long id;
    private String content;//动态内容
    private Date createTime;//创建时间
    private Integer likes;//点赞数量
    private Boolean published;//是否公开
}
