package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.Friend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FriendMapper {
    List<Friend> getFriendList();

    List<com.Lyu.LyuBlog.model.vo.Friend> getFriendVOList();

    int updateFriendPublishedById(Long id, Boolean published);

    int saveFriend(Friend friend);

    int updateFriend(com.Lyu.LyuBlog.model.dto.Friend friend);

    int deleteFriend(Long id);

    int updateViewsByNickname(String nickname);
}
