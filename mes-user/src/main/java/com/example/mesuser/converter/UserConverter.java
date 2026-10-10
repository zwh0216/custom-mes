package com.example.mesuser.converter;

import com.example.mesuser.dto.UserCreateDto;
import com.example.mesuser.dto.UserUpdateDto;
import com.example.mesuser.entity.User;

import java.time.LocalDateTime;

public class UserConverter {
    public static User toEntity (UserCreateDto userCreateDto) {
        LocalDateTime nowTime = LocalDateTime.now();
        User user = new User();
        user.setUserName(userCreateDto.getUserName());
        user.setPassword(userCreateDto.getPassword());
        user.setNickName(userCreateDto.getNickName());
        user.setProfilePhotoUrl(userCreateDto.getProfilePhotoUrl());
        user.setUpdateTime(nowTime);
        user.setCreateTime(nowTime);

        return user;
    }

    public static User toEntity (UserUpdateDto userUpdateDto) {
        User user = new User();
        user.setId(userUpdateDto.getId());
        user.setUserName(userUpdateDto.getUserName());
        user.setPassword(userUpdateDto.getPassword());
        user.setNickName(userUpdateDto.getNickName());
        user.setProfilePhotoUrl(userUpdateDto.getProfilePhotoUrl());
        LocalDateTime nowTime = LocalDateTime.now();
        user.setUpdateTime(nowTime);
        user.setCreateTime(nowTime);

        return user;
    }

}
