package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Visitor;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import com.Lyu.LyuBlog.service.VisitorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {
    @Override
    public List<Visitor> getVisitorListByDate(String startDate, String endDate) {
        return null;
    }

    @Override
    public List<String> getNewVisitorIpSourceByYesterday() {
        return null;
    }

    @Override
    public boolean hasUUID(String uuid) {
        return false;
    }

    @Override
    public void saveVisitor(Visitor visitor) {

    }

    @Override
    public void updatePVAndLastTimeByUUID(VisitLogUuidTime dto) {

    }

    @Override
    public void deleteVisitor(Long id, String uuid) {

    }
}
