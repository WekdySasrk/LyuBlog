package com.Lyu.LyuBlog.util.comment.channel;


import com.Lyu.LyuBlog.model.dto.Comment;
import org.springframework.context.annotation.Bean;

/**
*@ClassName: CommentNotifyChannel
*@Description: 评论提醒方式
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/

public interface CommentNotifyChannel {
    /**
     * 通过指定方式通知自己
     *
     * @param comment 当前收到的评论
     */
    void notifyMyself(Comment comment);
}

