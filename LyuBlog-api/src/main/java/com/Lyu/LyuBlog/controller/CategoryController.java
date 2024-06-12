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
*@ClassName: CategoryController
*@Description: 分类
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class CategoryController {
    @Autowired
    BlogService blogService;

    /**
     * 根据分类name分页查询公开博客列表
     *
     * @param categoryName 分类name
     * @param pageNum      页码
     * @return
     */
    @VisitLogger(VisitBehavior.CATEGORY)
    @GetMapping("/category")
    public Result category(@RequestParam String categoryName,
                           @RequestParam(defaultValue = "1") Integer pageNum) {
        PageResult<BlogInfo> pageResult = blogService.getBlogInfoListByCategoryNameAndIsPublished(categoryName, pageNum);
        return Result.ok("请求成功", pageResult);
    }
}
