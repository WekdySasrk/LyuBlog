package com.Lyu.LyuBlog.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogView {
    private Long id;
    private Integer views;
}
