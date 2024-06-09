package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Tag;
import com.Lyu.LyuBlog.model.vo.TagBlogCount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagMapper {
    List<Tag> getTagList();

    List<Tag> getTagListNotId();

    List<Tag> getTagListByBlogId(Long blogId);

    int saveTag(Tag tag);

    Tag getTagById(Long id);

    Tag getTagByName(String name);

    int deleteTagById(Long id);

    int updateTag(Tag tag);

    List<TagBlogCount> getTagBlogCount();

}
