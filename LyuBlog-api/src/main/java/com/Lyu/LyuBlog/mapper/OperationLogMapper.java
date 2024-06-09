package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.OperationLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OperationLogMapper {
    List<OperationLog> getOperationLogListByDate(String startDate, String endDate);

    int saveOperationLog(OperationLog log);

    int deleteOperationLogById(Long id);
}
