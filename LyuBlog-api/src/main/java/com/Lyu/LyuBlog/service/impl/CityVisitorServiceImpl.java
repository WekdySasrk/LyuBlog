package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.CityVisitor;
import com.Lyu.LyuBlog.mapper.CityVisitorMapper;
import com.Lyu.LyuBlog.service.CityVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
*@ClassName: CityVisitorServiceImpl
*@Description: 城市访客数量统计业务层实现
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@Service
public class CityVisitorServiceImpl implements CityVisitorService {
    @Autowired
    CityVisitorMapper cityVisitorMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveCityVisitor(CityVisitor cityVisitor) {
        cityVisitorMapper.saveCityVisitor(cityVisitor);
    }
}
