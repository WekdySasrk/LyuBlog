package com.Lyu.LyuBlog.task;

import com.Lyu.LyuBlog.constant.RedisKeyConstants;
import com.Lyu.LyuBlog.service.BlogService;
import com.Lyu.LyuBlog.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
*@ClassName: RedisSyncScheduleTask
*@Description: Redis相关定时任务
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@Component
public class RedisSyncScheduleTask {
    @Autowired
    RedisService redisService;
    @Autowired
    BlogService blogService;

    /**
     * 从Redis同步博客文章浏览量到数据库
     */
    public void syncBlogViewsToDatabase() {
        String redisKey = RedisKeyConstants.BLOG_VIEWS_MAP;
        Map blogViewsMap = redisService.getMapByHash(redisKey);
        Set<Integer> keys = blogViewsMap.keySet();
        for (Integer key : keys) {
            Integer views = (Integer) blogViewsMap.get(key);
            blogService.updateViews(key.longValue(), views);
        }
    }
}