package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.ExceptionLog;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface ExceptionLogService {
    List<ExceptionLog> getExceptionLogListByDate(String startDate, String endDate);

    @Async
    void saveExceptionLog(ExceptionLog log);

    void deleteExceptionLogById(Long id);
}
