package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.ExceptionLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExceptionLogMapper {
    List<ExceptionLog> getExceptionLogListByDate(String startDate, String endDate);

    int saveExceptionLog(ExceptionLog log);

    int deleteExceptionLogById(Long id);
}
