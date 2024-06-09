package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Blog;
import com.Lyu.LyuBlog.model.dto.BlogView;
import com.Lyu.LyuBlog.model.dto.BlogVisibility;
import com.Lyu.LyuBlog.model.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
*@ClassName: BlogMapper
*@Description: 博客文章持久层接口
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/
@Mapper
@Repository
public interface BlogMapper {
    List<Blog> getListByTitleAndCategoryId(String title, Integer categoryId);

    List<SearchBlog> getSearchBlogListByQueryAndIsPublished(String query);
    List<Blog> getIdAndTitleList();

    List<NewBlog> getNewBlogListByIsPublished();

    List<BlogInfo> getBlogInfoListByIsPublished();

    List<BlogInfo> getBlogInfoListByCategoryNameAndIsPublished(String categoryName);

    List<BlogInfo> getBlogInfoListByTagNameAndIsPublished(String tagName);

    List<String> getGroupYearMonthByIsPublished();

    List<ArchiveBlog> getArchiveBlogListByYearMonthAndIsPublished(String yearMonth);

    List<RandomBlog> getRandomBlogListByLimitNumAndIsPublishedAndIsRecommend(Integer limitNum);

    List<BlogView> getBlogViewsList();

    int deleteBlogById(Long id);

    int deleteBlogTagByBlogId(Long blogId);

    int saveBlog(com.Lyu.LyuBlog.model.dto.Blog blog);

    int saveBlogTag(Long blogId, Long tagId);

    int updateBlogRecommendById(Long blogId, Boolean recommend);

    int updateBlogVisibilityById(Long blogId, BlogVisibility bv);

    int updateBlogTopById(Long blogId, Boolean top);

    int updateViews(Long blogId, Integer views);

    Blog getBlogById(Long id);

    String getTitleByBlogId(Long id);

    BlogDetail getBlogByIdAndIsPublished(Long id);

    String getBlogPassword(Long blogId);

    int updateBlog(com.Lyu.LyuBlog.model.dto.Blog blog);

    int countBlog();

    int countBlogByIsPublished();

    int countBlogByCategoryId(Long categoryId);

    int countBlogByTagId(Long tagId);

    Boolean getCommentEnabledByBlogId(Long blogId);

    Boolean getPublishedByBlogId(Long blogId);

    List<CategoryBlogCount> getCategoryBlogCountList();
}
