package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Blog;
import com.Lyu.LyuBlog.model.dto.BlogVisibility;
import com.Lyu.LyuBlog.model.vo.*;
import com.Lyu.LyuBlog.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public List<Blog> getListByTitleAndCategoryId(String title, Integer categoryId) {
        return null;
    }

    @Override
    public List<SearchBlog> getSearchBlogListByQueryAndIsPublished(String query) {
        return null;
    }

    @Override
    public List<Blog> getIdAndTitleList() {
        return null;
    }

    @Override
    public List<NewBlog> getNewBlogListByIsPublished() {
        return null;
    }

    @Override
    public PageResult<BlogInfo> getBlogInfoListByIsPublished(Integer pageNum) {
        return null;
    }

    @Override
    public PageResult<BlogInfo> getBlogInfoListByCategoryNameAndIsPublished(String categoryName, Integer pageNum) {
        return null;
    }

    @Override
    public PageResult<BlogInfo> getBlogInfoListByTagNameAndIsPublished(String tagName, Integer pageNum) {
        return null;
    }

    @Override
    public Map<String, Object> getArchiveBlogAndCountByIsPublished() {
        return null;
    }

    @Override
    public List<RandomBlog> getRandomBlogListByLimitNumAndIsPublishedAndIsRecommend() {
        return null;
    }

    @Override
    public void deleteBlogById(Long id) {

    }

    @Override
    public void deleteBlogTagByBlogId(Long blogId) {

    }

    @Override
    public void saveBlog(com.Lyu.LyuBlog.model.dto.Blog blog) {

    }

    @Override
    public void saveBlogTag(Long blogId, Long tagId) {

    }

    @Override
    public void updateBlogRecommendById(Long blogId, Boolean recommend) {

    }

    @Override
    public void updateBlogVisibilityById(Long blogId, BlogVisibility blogVisibility) {

    }

    @Override
    public void updateBlogTopById(Long blogId, Boolean top) {

    }

    @Override
    public void updateViewsToRedis(Long blogId) {

    }

    @Override
    public void updateViews(Long blogId, Integer views) {

    }

    @Override
    public Blog getBlogById(Long id) {
        return null;
    }

    @Override
    public String getTitleByBlogId(Long id) {
        return null;
    }

    @Override
    public BlogDetail getBlogByIdAndIsPublished(Long id) {
        return null;
    }

    @Override
    public String getBlogPassword(Long blogId) {
        return null;
    }

    @Override
    public void updateBlog(Blog blog) {

    }

    @Override
    public int countBlogByIsPublished() {
        return 0;
    }

    @Override
    public int countBlogByCategoryId(Long categoryId) {
        return 0;
    }

    @Override
    public int countBlogByTagId(Long tagId) {
        return 0;
    }

    @Override
    public Boolean getCommentEnabledByBlogId(Long blogId) {
        return null;
    }

    @Override
    public Boolean getPublishedByBlogId(Long blogId) {
        return null;
    }
}
