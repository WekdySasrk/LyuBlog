package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.annotation.VisitLogger;
import com.Lyu.LyuBlog.enums.VisitBehavior;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
*@ClassName: ArchiveController
*@Description: 归档页面
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class ArchiveController {
    @Autowired
    BlogService blogService;

    /**
     * 按年月分组归档公开博客 统计公开博客总数
     *
     * @return
     */
    @VisitLogger(VisitBehavior.ARCHIVE)
    @GetMapping("/archives")
    public Result archives() {
        Map<String, Object> archiveBlogMap = blogService.getArchiveBlogAndCountByIsPublished();
        return Result.ok("请求成功", archiveBlogMap);
    }
}
