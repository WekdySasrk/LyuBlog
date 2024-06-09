package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.VisitLog;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface VisitLogService {
    List<VisitLog> getVisitLogListByUUIDAndDate(String uuid, String startDate, String endDate);

    List<VisitLogUuidTime> getUUIDAndCreateTimeByYesterday();

    @Async
    void saveVisitLog(VisitLog log);

    void deleteVisitLogById(Long id);
}
