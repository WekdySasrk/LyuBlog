package com.Lyu.LyuBlog.controller.admin;

import com.Lyu.LyuBlog.entity.User;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
*@ClassName: AccountAdminController
*@Description: 账号后台管理
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
@RequestMapping("/admin")
public class AccountAdminController {
    @Autowired
    UserService userService;

    /**
     * 账号密码修改
     */
    @PostMapping("/account")
    public Result account(@RequestBody User user, @RequestHeader(value = "Authorization", defaultValue = "") String jwt) {
        boolean res = userService.changeAccount(user, jwt);
        return res ? Result.ok("修改成功") : Result.error("修改失败");
    }
}
