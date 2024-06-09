package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.VisitLog;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import com.Lyu.LyuBlog.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {
    @Override
    public List<VisitLog> getVisitLogListByUUIDAndDate(String uuid, String startDate, String endDate) {
        return null;
    }

    @Override
    public List<VisitLogUuidTime> getUUIDAndCreateTimeByYesterday() {
        return null;
    }

    @Override
    public void saveVisitLog(VisitLog log) {

    }

    @Override
    public void deleteVisitLogById(Long id) {

    }
}
