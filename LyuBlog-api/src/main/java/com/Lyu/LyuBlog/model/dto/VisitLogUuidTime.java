package com.Lyu.LyuBlog.model.dto;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class VisitLogUuidTime {
    private String uuid;
    private Date time;
    private Integer pv;

}
