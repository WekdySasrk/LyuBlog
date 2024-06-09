package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.ExceptionLog;
import com.Lyu.LyuBlog.service.ExceptionLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {
    @Override
    public List<ExceptionLog> getExceptionLogListByDate(String startDate, String endDate) {
        return null;
    }

    @Override
    public void saveExceptionLog(ExceptionLog log) {

    }

    @Override
    public void deleteExceptionLogById(Long id) {

    }
}
