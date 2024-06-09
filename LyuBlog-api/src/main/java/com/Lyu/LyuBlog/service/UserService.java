package com.Lyu.LyuBlog.service;

import com.Lyu.LyuBlog.entity.User;

public interface UserService {
    User findUserByUsernameAndPassword(String username, String password);

    User findUserById(Long id);

    boolean changeAccount(User user, String jwt);
}
