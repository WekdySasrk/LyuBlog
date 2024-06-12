package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.VisitLog;
import com.Lyu.LyuBlog.exception.PersistenceException;
import com.Lyu.LyuBlog.mapper.VisitLogMapper;
import com.Lyu.LyuBlog.model.dto.UserAgentDTO;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import com.Lyu.LyuBlog.service.VisitLogService;
import com.Lyu.LyuBlog.util.IpAddressUtils;
import com.Lyu.LyuBlog.util.UserAgentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
*@ClassName: VisitLogServiceImpl
*@Description: 访问日志业务层实现
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@Service
public class VisitLogServiceImpl implements VisitLogService {
    @Autowired
    VisitLogMapper visitLogMapper;
    @Autowired
    UserAgentUtils userAgentUtils;

    @Override
    public List<VisitLog> getVisitLogListByUUIDAndDate(String uuid, String startDate, String endDate) {
        return visitLogMapper.getVisitLogListByUUIDAndDate(uuid, startDate, endDate);
    }

    @Override
    public List<VisitLogUuidTime> getUUIDAndCreateTimeByYesterday() {
        return visitLogMapper.getUUIDAndCreateTimeByYesterday();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveVisitLog(VisitLog log) {
        String ipSource = IpAddressUtils.getCityInfo(log.getIp());
        UserAgentDTO userAgentDTO = userAgentUtils.parseOsAndBrowser(log.getUserAgent());
        log.setIpSource(ipSource);
        log.setOs(userAgentDTO.getOs());
        log.setBrowser(userAgentDTO.getBrowser());
        if (visitLogMapper.saveVisitLog(log) != 1) {
            throw new PersistenceException("日志添加失败");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteVisitLogById(Long id) {
        if (visitLogMapper.deleteVisitLogById(id) != 1) {
            throw new PersistenceException("删除日志失败");
        }
    }
}
