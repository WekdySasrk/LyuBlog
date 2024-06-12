package com.Lyu.LyuBlog.config.properties;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * Github配置
 * @author lyu
 * @date 2020/10/18
 *
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "upload.github")
public class GithubProperties {
    private String token;
    private String username;
    private String repos;
    private String reposPath;
}
