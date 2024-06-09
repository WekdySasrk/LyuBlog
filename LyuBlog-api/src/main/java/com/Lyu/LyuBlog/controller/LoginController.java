package com.Lyu.LyuBlog.controller;

import com.Lyu.LyuBlog.constant.JwtConstants;
import com.Lyu.LyuBlog.entity.User;
import com.Lyu.LyuBlog.model.dto.LoginInfo;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.UserService;
import com.Lyu.LyuBlog.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginInfo loginInfo) {
        User user = userService.findUserByUsernameAndPassword(loginInfo.getUsername(), loginInfo.getPassword());
        if(!"ROLE_admin".equals(user.getRole()))
        {
            return Result.create(401, "权限不足");
        }
        user.setPassword(null);
        String jwt = JwtUtils.generateToken(JwtConstants.ADMIN_PREFIX + user.getUsername());
        Map<String, Object> map = new HashMap<>(4);
        map.put("user", user);
        map.put("token", jwt);
        return Result.ok("登录成功", map);


    }

}
