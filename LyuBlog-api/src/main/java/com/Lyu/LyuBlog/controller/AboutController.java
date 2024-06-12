package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.annotation.VisitLogger;
import com.Lyu.LyuBlog.enums.VisitBehavior;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
*@ClassName: AboutController
*@Description: 关于我页面
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class AboutController {
    @Autowired
    AboutService aboutService;

    /**
     * 获取关于我页面信息
     *
     * @return
     */
    @VisitLogger(VisitBehavior.ABOUT)
    @GetMapping("/about")
    public Result about() {
        return Result.ok("获取成功", aboutService.getAboutInfo());
    }

}
