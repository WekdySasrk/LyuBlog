package com.Lyu.LyuBlog.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
@ToString

public class VisitLogUuidTime {
    private String uuid;
    private Date time;
    private Integer pv;

}
