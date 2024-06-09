package com.Lyu.LyuBlog.service.impl;

import com.Lyu.LyuBlog.entity.Friend;
import com.Lyu.LyuBlog.model.vo.FriendInfo;
import com.Lyu.LyuBlog.service.FriendService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FriendServiceImpl implements FriendService {
    @Override
    public List<Friend> getFriendList() {
        return null;
    }

    @Override
    public List<com.Lyu.LyuBlog.model.vo.Friend> getFriendVOList() {
        return null;
    }

    @Override
    public void updateFriendPublishedById(Long friendId, Boolean published) {

    }

    @Override
    public void saveFriend(Friend friend) {

    }

    @Override
    public void updateFriend(com.Lyu.LyuBlog.model.dto.Friend friend) {

    }

    @Override
    public void deleteFriend(Long id) {

    }

    @Override
    public void updateViewsByNickname(String nickname) {

    }

    @Override
    public FriendInfo getFriendInfo(boolean cache, boolean md) {
        return null;
    }

    @Override
    public void updateFriendInfoContent(String content) {

    }

    @Override
    public void updateFriendInfoCommentEnabled(Boolean commentEnabled) {

    }
}
