package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.VisitRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VisitRecordMapper {
    List<VisitRecord> getVisitRecordListByLimit(Integer limit);

    int saveVisitRecord(VisitRecord visitRecord);

}
