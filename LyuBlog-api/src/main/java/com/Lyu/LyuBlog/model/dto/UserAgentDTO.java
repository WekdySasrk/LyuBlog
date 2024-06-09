package com.Lyu.LyuBlog.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserAgentDTO {
    private String os;
    private String browser;
}
