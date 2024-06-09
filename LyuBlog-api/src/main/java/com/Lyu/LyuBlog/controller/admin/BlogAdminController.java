package com.Lyu.LyuBlog.controller.admin;

import com.Lyu.LyuBlog.entity.Category;
import com.Lyu.LyuBlog.entity.Tag;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.CategoryService;
import com.Lyu.LyuBlog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class BlogAdminController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    TagService tagService;


    @GetMapping("/categoryAndTag")
    public Result categoryAndTag() {
        List<Category> categories = categoryService.getCategoryList();
        List<Tag> tags = tagService.getTagList();
        Map<String, Object> map = new HashMap<>(4);
        map.put("categories", categories);
        map.put("tags", tags);
        return Result.ok("请求成功", map);
    }
}
