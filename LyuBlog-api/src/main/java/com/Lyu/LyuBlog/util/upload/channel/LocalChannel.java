package com.Lyu.LyuBlog.util.upload.channel;


import com.Lyu.LyuBlog.config.properties.BlogProperties;
import com.Lyu.LyuBlog.config.properties.UploadProperties;
import com.Lyu.LyuBlog.util.upload.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/**
*@ClassName: LocalChannel
*@Description: 本地存储方式
*@Author: Lyu
*@Date: 2024/6/12
*@Version:
*
**/
@Lazy
@Component
public class LocalChannel implements FileUploadChannel {
    @Autowired
    private BlogProperties blogProperties;
    @Autowired
    private UploadProperties uploadProperties;

    /**
     * 将图片保存到本地，并返回访问本地图片的URL
     *
     * @param image 需要保存的图片
     * @return 访问图片的URL
     * @throws Exception
     */
    @Override
    public String upload(UploadUtils.ImageResource image) throws Exception {
        File folder = new File(uploadProperties.getPath());
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String fileName = UUID.randomUUID() + "." + image.getType();
        FileOutputStream fileOutputStream = new FileOutputStream(uploadProperties.getPath() + fileName);
        fileOutputStream.write(image.getData());
        fileOutputStream.close();
        return blogProperties.getApi() + "/image/" + fileName;
    }
}