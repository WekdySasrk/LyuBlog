package com.Lyu.LyuBlog.controller.admin;

import com.Lyu.LyuBlog.constant.RedisKeyConstants;
import com.Lyu.LyuBlog.entity.CityVisitor;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.DashboardService;
import com.Lyu.LyuBlog.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@ClassName: DashboardAdminController
*@Description: 后台管理仪表盘
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
@RequestMapping("/admin")
public class DashboardAdminController {

    @Autowired
    DashboardService dashboardService;

    @Autowired
    RedisService redisService;

    @GetMapping("/dashboard")
    public Result dashboard(){
        int todayPV = dashboardService.countVisitLogByToday();
        int todayUV = redisService.countBySet(RedisKeyConstants.IDENTIFICATION_SET);

        int blogCount = dashboardService.getBlogCount();

        int commentCount = dashboardService.getCommentCount();
        Map<String, List> categoryBlogCountMap = dashboardService.getCategoryBlogCountMap();
        Map<String, List> tagBlogCountMap = dashboardService.getTagBlogCountMap();
        Map<String, List> visitRecordMap = dashboardService.getVisitRecordMap();
        List<CityVisitor> cityVisitorList = dashboardService.getCityVisitorList();

        Map<String, Object> map = new HashMap<>(16);
        map.put("pv", todayPV);
        map.put("uv", todayUV);
        map.put("blogCount", blogCount);
        map.put("commentCount", commentCount);
        map.put("category", categoryBlogCountMap);
        map.put("tag", tagBlogCountMap);
        map.put("visitRecord", visitRecordMap);
        map.put("cityVisitor", cityVisitorList);
        return Result.ok("获取成功", map);


    }
}
