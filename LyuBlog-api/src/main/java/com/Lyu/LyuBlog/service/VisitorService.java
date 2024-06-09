package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.Visitor;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface VisitorService {
    List<Visitor> getVisitorListByDate(String startDate, String endDate);

    List<String> getNewVisitorIpSourceByYesterday();

    boolean hasUUID(String uuid);

    @Async
    void saveVisitor(Visitor visitor);

    void updatePVAndLastTimeByUUID(VisitLogUuidTime dto);

    void deleteVisitor(Long id, String uuid);

}
