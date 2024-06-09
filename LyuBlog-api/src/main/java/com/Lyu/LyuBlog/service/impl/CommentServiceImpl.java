package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Comment;
import com.Lyu.LyuBlog.model.vo.PageComment;
import com.Lyu.LyuBlog.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public List<Comment> getListByPageAndParentCommentId(Integer page, Long blogId, Long parentCommentId) {
        return null;
    }

    @Override
    public List<PageComment> getPageCommentList(Integer page, Long blogId, Long parentCommentId) {
        return null;
    }

    @Override
    public Comment getCommentById(Long id) {
        return null;
    }

    @Override
    public void updateCommentPublishedById(Long commentId, Boolean published) {

    }

    @Override
    public void updateCommentNoticeById(Long commentId, Boolean notice) {

    }

    @Override
    public void deleteCommentById(Long commentId) {

    }

    @Override
    public void deleteCommentsByBlogId(Long blogId) {

    }

    @Override
    public void updateComment(Comment comment) {

    }

    @Override
    public int countByPageAndIsPublished(Integer page, Long blogId, Boolean isPublished) {
        return 0;
    }

    @Override
    public void saveComment(com.Lyu.LyuBlog.model.dto.Comment comment) {

    }
}
