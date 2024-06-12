package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.annotation.VisitLogger;
import com.Lyu.LyuBlog.enums.VisitBehavior;
import com.Lyu.LyuBlog.model.vo.Friend;
import com.Lyu.LyuBlog.model.vo.FriendInfo;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
*@ClassName: FriendController
*@Description: 友链
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
public class FriendController {
    @Autowired
    FriendService friendService;

    /**
     * 获取友链页面
     *
     * @return
     */
    @VisitLogger(VisitBehavior.FRIEND)
    @GetMapping("/friends")
    public Result friends() {
        List<Friend> friendList = friendService.getFriendVOList();
        FriendInfo friendInfo = friendService.getFriendInfo(true, true);
        Map<String, Object> map = new HashMap<>(4);
        map.put("friendList", friendList);
        map.put("friendInfo", friendInfo);
        return Result.ok("获取成功", map);
    }

    /**
     * 按昵称增加友链浏览次数
     *
     * @param nickname 友链昵称
     * @return
     */
    @VisitLogger(VisitBehavior.CLICK_FRIEND)
    @PostMapping("/friend")
    public Result addViews(@RequestParam String nickname) {
        friendService.updateViewsByNickname(nickname);
        return Result.ok("请求成功");
    }
}
