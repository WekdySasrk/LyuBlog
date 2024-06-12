package com.Lyu.LyuBlog.util.upload.channel;


import com.Lyu.LyuBlog.util.upload.UploadUtils;

/**
*@ClassName: FileUploadChannel
*@Description: 文件上传方式
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
public interface FileUploadChannel {
    /**
     * 通过指定方式上传文件
     *
     * @param image 需要保存的图片
     * @return 访问图片的URL
     * @throws Exception
     */
    String upload(UploadUtils.ImageResource image) throws Exception;
}
