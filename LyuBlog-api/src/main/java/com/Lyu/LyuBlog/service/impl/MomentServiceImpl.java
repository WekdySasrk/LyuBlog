package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Moment;
import com.Lyu.LyuBlog.service.MomentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MomentServiceImpl implements MomentService {
    @Override
    public List<Moment> getMomentList() {
        return null;
    }

    @Override
    public List<Moment> getMomentVOList(Integer pageNum, boolean adminIdentity) {
        return null;
    }

    @Override
    public void addLikeByMomentId(Long momentId) {

    }

    @Override
    public void updateMomentPublishedById(Long momentId, Boolean published) {

    }

    @Override
    public Moment getMomentById(Long id) {
        return null;
    }

    @Override
    public void deleteMomentById(Long id) {

    }

    @Override
    public void saveMoment(Moment moment) {

    }

    @Override
    public void updateMoment(Moment moment) {

    }
}
