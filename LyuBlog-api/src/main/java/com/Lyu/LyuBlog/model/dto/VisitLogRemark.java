package com.Lyu.LyuBlog.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VisitLogRemark {
    /**
     * 访问内容
     */
    private String content;

    /**
     * 备注
     */
    private String remark;
}
