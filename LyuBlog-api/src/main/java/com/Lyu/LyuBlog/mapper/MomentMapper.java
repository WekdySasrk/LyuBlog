package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Moment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MomentMapper {
    List<Moment> getMomentList();

    int addLikeByMomentId(Long momentId);

    int updateMomentPublishedById(Long momentId, Boolean published);

    Moment getMomentById(Long id);

    int deleteMomentById(Long id);

    int saveMoment(Moment moment);

    int updateMoment(Moment moment);
}
