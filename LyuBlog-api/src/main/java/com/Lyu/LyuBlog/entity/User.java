package com.Lyu.LyuBlog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
*@ClassName: User
*@Description: 用户实体类
*@Author: Lyu
*@Date: 2024/4/13
*@Version:
*
**/

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements UserDetails {
    private Long id;//用户id
    private String username;//用户名
    private String password;//密码
    private String nickname;//昵称
    private String avatar;//头像（url）
    private String email;//电子邮件
    private Date createTime;//创建时间
    private Date updateTime;//更新时间
    private String role;//职位


    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority(role));
        return authorityList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
