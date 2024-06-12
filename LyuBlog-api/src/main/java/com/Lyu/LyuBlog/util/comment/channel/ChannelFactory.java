package com.Lyu.LyuBlog.util.comment.channel;


import com.Lyu.LyuBlog.constant.CommentConstants;
import com.Lyu.LyuBlog.util.common.SpringContextUtils;

/**
*@ClassName: ChannelFactory
*@Description: 评论提醒方式
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
public class ChannelFactory {
    /**
     * 创建评论提醒方式
     *
     * @param channelName 方式名称
     * @return
     */
    public static CommentNotifyChannel getChannel(String channelName) {
        if (CommentConstants.TELEGRAM.equalsIgnoreCase(channelName)) {
            return SpringContextUtils.getBean("telegramChannel", CommentNotifyChannel.class);
        } else if (CommentConstants.MAIL.equalsIgnoreCase(channelName)) {
            return SpringContextUtils.getBean("mailChannel", CommentNotifyChannel.class);
        }
        throw new RuntimeException("Unsupported value in [application.properties]: [comment.notify.channel]");
    }
}
