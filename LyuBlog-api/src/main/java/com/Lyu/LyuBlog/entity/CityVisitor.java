package com.Lyu.LyuBlog.entity;

import lombok.*;

/**
*@ClassName: CityVisitor
*@Description: 城市访客数量
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CityVisitor {
    private String city;//城市名称
    private Integer uv;//独立访客数量
}
