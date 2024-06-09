package com.Lyu.LyuBlog.mapper;


import com.Lyu.LyuBlog.entity.Visitor;
import com.Lyu.LyuBlog.model.dto.VisitLogUuidTime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VisitorMapper {
    List<Visitor> getVisitorListByDate(String startDate, String endDate);

    List<String> getNewVisitorIpSourceByYesterday();

    int hasUUID(String uuid);

    int saveVisitor(Visitor visitor);

    int updatePVAndLastTimeByUUID(VisitLogUuidTime dto);

    int deleteVisitorById(Long id);
}
