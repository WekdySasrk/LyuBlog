package com.Lyu.LyuBlog.mapper;


import com.Lyu.LyuBlog.entity.ScheduleJob;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ScheduleJobMapper {
    List<ScheduleJob> getJobList();

    ScheduleJob getJobById(Long jobId);

    int saveJob(ScheduleJob scheduleJob);

    int updateJob(ScheduleJob scheduleJob);

    int deleteJobById(Long jobId);

    int updateJobStatusById(Long jobId, Boolean status);

}
