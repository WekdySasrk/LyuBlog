package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.LoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginLogMapper {
    List<LoginLog> getLoginLogListByDate(String startDate, String endDate);

    int saveLoginLog(LoginLog log);

    int deleteLoginLogById(Long id);
}
