package com.Lyu.LyuBlog.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class NewBlog {
    private Long id;
    private String title;
    private String password;
    private Boolean privacy;
}
