package com.Lyu.LyuBlog.controller.admin;

import com.Lyu.LyuBlog.entity.VisitLog;
import com.Lyu.LyuBlog.model.vo.Result;
import com.Lyu.LyuBlog.service.VisitLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@ClassName: VisitLogController
*@Description: 访问日志后台管理
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@RestController
@RequestMapping("/admin")
public class VisitLogController {
    @Autowired
    VisitLogService visitLogService;

    /**
     * 分页查询访问日志列表
     *
     * @param uuid     按访客标识码模糊查询
     * @param date     按访问时间查询
     * @param pageNum  页码
     * @param pageSize 每页个数
     * @return
     */
    @GetMapping("/visitLogs")
    public Result visitLogs(@RequestParam(defaultValue = "") String uuid,
                            @RequestParam(defaultValue = "") String[] date,
                            @RequestParam(defaultValue = "1") Integer pageNum,
                            @RequestParam(defaultValue = "10") Integer pageSize) {
        String startDate = null;
        String endDate = null;
        if (date.length == 2) {
            startDate = date[0];
            endDate = date[1];
        }
        String orderBy = "create_time desc";
        PageHelper.startPage(pageNum, pageSize, orderBy);
        PageInfo<VisitLog> pageInfo = new PageInfo<>(visitLogService.getVisitLogListByUUIDAndDate(StringUtils.trim(uuid), startDate, endDate));
        return Result.ok("请求成功", pageInfo);
    }

    /**
     * 按id删除访问日志
     *
     * @param id 日志id
     * @return
     */
    @DeleteMapping("/visitLog")
    public Result delete(@RequestParam Long id) {
        visitLogService.deleteVisitLogById(id);
        return Result.ok("删除成功");
    }
}
