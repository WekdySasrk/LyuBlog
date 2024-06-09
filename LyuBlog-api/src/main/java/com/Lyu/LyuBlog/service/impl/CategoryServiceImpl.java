package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Category;
import com.Lyu.LyuBlog.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> getCategoryList() {
        return null;
    }

    @Override
    public List<Category> getCategoryNameList() {
        return null;
    }

    @Override
    public void saveCategory(Category category) {

    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }

    @Override
    public void updateCategory(Category category) {

    }
}
