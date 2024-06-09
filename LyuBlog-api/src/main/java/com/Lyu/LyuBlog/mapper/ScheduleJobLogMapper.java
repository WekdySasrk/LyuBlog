package com.Lyu.LyuBlog.mapper;


import com.Lyu.LyuBlog.entity.ScheduleJobLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ScheduleJobLogMapper {
    List<ScheduleJobLog> getJobLogListByDate(String startDate, String endDate);

    int saveJobLog(ScheduleJobLog jobLog);

    int deleteJobLogByLogId(Long logId);
}
