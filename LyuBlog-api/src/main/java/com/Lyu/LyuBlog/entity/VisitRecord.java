package com.Lyu.LyuBlog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*@ClassName: VisitRecord
*@Description: 访问记录
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Getter
@Setter
@ToString
public class VisitRecord {
    private Long id;
    private Integer pv;//访问量
    private Integer uv;//独立用户
    private String date;//日期"02-23"

    public VisitRecord(Integer pv, Integer uv, String date) {
        this.pv = pv;
        this.uv = uv;
        this.date = date;
    }
}
