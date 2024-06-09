package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository//@Repository注解可以标记在任何的类上，用来表明该类是用来执行与数据库相关的操作(即dao对象)，并支持自动处理数据库操作产生的异常
public interface CategoryMapper {
    List<Category> getCategoryList();

    List<Category> getCategoryNameList();

    int saveCategory(Category category);

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    int deleteCategoryById(Long id);

    int updateCategory(Category category);

}
