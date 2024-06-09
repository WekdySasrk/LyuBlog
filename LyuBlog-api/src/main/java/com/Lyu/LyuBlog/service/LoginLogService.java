package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.LoginLog;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface LoginLogService {
    List<LoginLog> getLoginLogListByDate(String startDate, String endDate);

    @Async
    void saveLoginLog(LoginLog log);

    void deleteLoginLogById(Long id);
}
