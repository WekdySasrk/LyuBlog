package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Tag;
import com.Lyu.LyuBlog.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TagServiceImpl implements TagService {
    @Override
    public List<Tag> getTagList() {
        return null;
    }

    @Override
    public List<Tag> getTagListNotId() {
        return null;
    }

    @Override
    public List<Tag> getTagListByBlogId(Long blogId) {
        return null;
    }

    @Override
    public void saveTag(Tag tag) {

    }

    @Override
    public Tag getTagById(Long id) {
        return null;
    }

    @Override
    public Tag getTagByName(String name) {
        return null;
    }

    @Override
    public void deleteTagById(Long id) {

    }

    @Override
    public void updateTag(Tag tag) {

    }
}
