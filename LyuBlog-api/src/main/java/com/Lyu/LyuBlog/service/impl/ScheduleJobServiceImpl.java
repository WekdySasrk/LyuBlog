package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.ScheduleJob;
import com.Lyu.LyuBlog.entity.ScheduleJobLog;
import com.Lyu.LyuBlog.service.ScheduleJobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleJobServiceImpl implements ScheduleJobService {
    @Override
    public List<ScheduleJob> getJobList() {
        return null;
    }

    @Override
    public void saveJob(ScheduleJob scheduleJob) {

    }

    @Override
    public void updateJob(ScheduleJob scheduleJob) {

    }

    @Override
    public void deleteJobById(Long jobId) {

    }

    @Override
    public void runJobById(Long jobId) {

    }

    @Override
    public void updateJobStatusById(Long jobId, Boolean status) {

    }

    @Override
    public List<ScheduleJobLog> getJobLogListByDate(String startDate, String endDate) {
        return null;
    }

    @Override
    public void saveJobLog(ScheduleJobLog log) {

    }

    @Override
    public void deleteJobLogByLogId(Long logId) {

    }
}
