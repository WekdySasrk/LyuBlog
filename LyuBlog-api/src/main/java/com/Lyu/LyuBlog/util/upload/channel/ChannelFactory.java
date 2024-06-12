package com.Lyu.LyuBlog.util.upload.channel;


import com.Lyu.LyuBlog.constant.UploadConstants;
import com.Lyu.LyuBlog.util.common.SpringContextUtils;

/**
*@ClassName: ChannelFactory
*@Description: 文件上传方式
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
public class ChannelFactory {
    /**
     * 创建文件上传方式
     *
     * @param channelName 方式名称
     * @return 文件上传Channel
     */
    public static FileUploadChannel getChannel(String channelName) {
        switch (channelName.toLowerCase()) {
            case UploadConstants.LOCAL:
                return SpringContextUtils.getBean(LocalChannel.class);
            case UploadConstants.GITHUB:
                return SpringContextUtils.getBean(GithubChannel.class);
            case UploadConstants.UPYUN:
                return SpringContextUtils.getBean(UpyunChannel.class);
        }
        throw new RuntimeException("Unsupported value in [application.properties]: [upload.channel]");
    }
}

