package com.Lyu.LyuBlog.mapper;

import com.Lyu.LyuBlog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User findByUsername(String username);

    User findById(Long id);

    int updateUserByUsername(String username, User user);

}
