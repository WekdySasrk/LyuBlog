package com.Lyu.LyuBlog.controller.admin;

import com.Lyu.LyuBlog.annotation.OperationLogger;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
*@ClassName: AboutAdminController
*@Description: 关于我页面后台管理
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
@RequestMapping("/admin")
public class AboutAdminController {
    @Autowired
    AboutService aboutService;

    /**
     * 获取关于我页面配置
     *
     * @return
     */
    @GetMapping("/about")
    public Result about() {
        return Result.ok("请求成功", aboutService.getAboutSetting());
    }

    /**
     * 修改关于我页面
     *
     * @param map
     * @return
     */
    @OperationLogger("修改关于我页面")
    @PutMapping("/about")
    public Result updateAbout(@RequestBody Map<String, String> map) {
        aboutService.updateAbout(map);
        return Result.ok("修改成功");
    }
}
