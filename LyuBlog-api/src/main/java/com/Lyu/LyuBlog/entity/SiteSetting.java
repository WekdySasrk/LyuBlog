package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*@ClassName: SiteSetting
*@Description: 站点设置
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class SiteSetting {
    private Long id;
    private String nameEn;
    private String nameZh;
    private String value;
    private Integer type;
}
