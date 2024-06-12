package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.entity.Category;
import com.Lyu.LyuBlog.entity.Tag;
import com.Lyu.LyuBlog.model.vo.NewBlog;
import com.Lyu.LyuBlog.model.vo.RandomBlog;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.BlogService;
import com.Lyu.LyuBlog.service.CategoryService;
import com.Lyu.LyuBlog.service.SiteSettingService;
import com.Lyu.LyuBlog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
*@ClassName: IndexController
*@Description: 站点相关
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class IndexController {
    @Autowired
    SiteSettingService siteSettingService;
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    TagService tagService;

    /**
     * 获取站点配置信息、最新推荐博客、分类列表、标签云、随机博客
     *
     * @return
     */
    @GetMapping("/site")
    public Result site() {
        Map<String, Object> map = siteSettingService.getSiteInfo();
        List<NewBlog> newBlogList = blogService.getNewBlogListByIsPublished();
        List<Category> categoryList = categoryService.getCategoryNameList();
        List<Tag> tagList = tagService.getTagListNotId();
        List<RandomBlog> randomBlogList = blogService.getRandomBlogListByLimitNumAndIsPublishedAndIsRecommend();
        map.put("newBlogList", newBlogList);
        map.put("categoryList", categoryList);
        map.put("tagList", tagList);
        map.put("randomBlogList", randomBlogList);
        return Result.ok("请求成功", map);
    }
}
