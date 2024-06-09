package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.Friend;
import com.Lyu.LyuBlog.model.vo.FriendInfo;

import java.util.List;

public interface FriendService {
    List<Friend> getFriendList();

    List<com.Lyu.LyuBlog.model.vo.Friend> getFriendVOList();

    void updateFriendPublishedById(Long friendId, Boolean published);

    void saveFriend(Friend friend);

    void updateFriend(com.Lyu.LyuBlog.model.dto.Friend friend);

    void deleteFriend(Long id);

    void updateViewsByNickname(String nickname);

    FriendInfo getFriendInfo(boolean cache, boolean md);

    void updateFriendInfoContent(String content);

    void updateFriendInfoCommentEnabled(Boolean commentEnabled);

}
