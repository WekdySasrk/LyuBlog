package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.LoginLog;
import com.Lyu.LyuBlog.service.LoginLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Override
    public List<LoginLog> getLoginLogListByDate(String startDate, String endDate) {
        return null;
    }

    @Override
    public void saveLoginLog(LoginLog log) {

    }

    @Override
    public void deleteLoginLogById(Long id) {

    }
}
