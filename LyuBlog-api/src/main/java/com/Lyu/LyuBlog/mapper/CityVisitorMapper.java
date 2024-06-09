package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.CityVisitor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityVisitorMapper {
    List<CityVisitor> getCityVisitorList();

    int saveCityVisitor(CityVisitor cityVisitor);
}
