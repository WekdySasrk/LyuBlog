package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.About;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *@ClassName: AboutMapper
 *@Description: 关于我页面持久层接口
 *@Author: Lyu (LyuBlog)
 *@Date: 2024/4/13
 *@Version: 1.0
 *
 **/
@Mapper
@Repository
public interface AboutMapper {
    List<About> getList();

    int updateAbout(String nameEn, String value);

    String getAboutCommentEnabled();
}

