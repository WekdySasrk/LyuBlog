package com.Lyu.LyuBlog.config.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "upload.upyun")
public class UpyunProperties {
    /**
     * 又拍云存储空间名称
     */
    private String bucketName;
    /**
     * 操作员名称
     */
    private String username;
    /**
     * 操作员密码
     */
    private String password;
    /**
     * 存储路径
     */
    private String path;
    /**
     * CDN访问域名
     */
    private String domain;
}