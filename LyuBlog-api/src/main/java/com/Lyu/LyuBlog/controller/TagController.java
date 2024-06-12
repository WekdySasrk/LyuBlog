package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.annotation.VisitLogger;
import com.Lyu.LyuBlog.enums.VisitBehavior;
import com.Lyu.LyuBlog.model.vo.BlogInfo;
import com.Lyu.LyuBlog.model.vo.PageResult;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
*@ClassName: TagController
*@Description: 标签
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class TagController {
    @Autowired
    BlogService blogService;

    /**
     * 根据标签name分页查询公开博客列表
     *
     * @param tagName 标签name
     * @param pageNum 页码
     * @return
     */
    @VisitLogger(VisitBehavior.TAG)
    @GetMapping("/tag")
    public Result tag(@RequestParam String tagName,
                      @RequestParam(defaultValue = "1") Integer pageNum) {
        PageResult<BlogInfo> pageResult = blogService.getBlogInfoListByTagNameAndIsPublished(tagName, pageNum);
        return Result.ok("请求成功", pageResult);
    }
}
