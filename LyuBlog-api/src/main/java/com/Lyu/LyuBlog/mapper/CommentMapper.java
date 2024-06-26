package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Comment;
import com.Lyu.LyuBlog.model.vo.PageComment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    List<Comment> getListByPageAndParentCommentId(Integer page, Long blogId, Long parentCommentId);

    List<Comment> getListByParentCommentId(Long parentCommentId);

    List<PageComment> getPageCommentListByPageAndParentCommentId(Integer page, Long blogId, Long parentCommentId);

    Comment getCommentById(Long id);

    int updateCommentPublishedById(Long commentId, Boolean published);

    int updateCommentNoticeById(Long commentId, Boolean notice);

    int deleteCommentById(Long commentId);

    int deleteCommentsByBlogId(Long blogId);

    int updateComment(Comment comment);

    int countByPageAndIsPublished(Integer page, Long blogId, Boolean isPublished);

    int countComment();

    int saveComment(com.Lyu.LyuBlog.model.dto.Comment comment);
}
