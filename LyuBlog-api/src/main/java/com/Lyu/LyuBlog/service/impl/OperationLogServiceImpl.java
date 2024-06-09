package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.OperationLog;
import com.Lyu.LyuBlog.service.OperationLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationLogServiceImpl implements OperationLogService {
    @Override
    public List<OperationLog> getOperationLogListByDate(String startDate, String endDate) {
        return null;
    }

    @Override
    public void saveOperationLog(OperationLog log) {

    }

    @Override
    public void deleteOperationLogById(Long id) {

    }
}
