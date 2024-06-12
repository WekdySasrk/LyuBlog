package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.VisitRecord;
import com.Lyu.LyuBlog.mapper.VisitRecordMapper;
import com.Lyu.LyuBlog.service.VisitRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
*@ClassName: VisitRecordServiceImpl
*@Description: 访问记录业务层实现
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@Service
public class VisitRecordServiceImpl implements VisitRecordService {
    @Autowired
    VisitRecordMapper visitRecordMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveVisitRecord(VisitRecord visitRecord) {
        visitRecordMapper.saveVisitRecord(visitRecord);
    }
}
