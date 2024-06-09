package com.Lyu.LyuBlog.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Introduction {
    private String avatar;
    private String name;
    private String github;
    private String telegram;
    private String qq;
    private String bilibili;
    private String netease;
    private String email;

    private List<String> rollText = new ArrayList<>();
    private List<Favorite> favorites = new ArrayList<>();

}
