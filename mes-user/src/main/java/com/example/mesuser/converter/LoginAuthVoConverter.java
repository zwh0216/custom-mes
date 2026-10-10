package com.example.mesuser.converter;


import com.example.mesuser.entity.User;
import com.example.mesuser.vo.LoginAuthVo;

public class LoginAuthVoConverter {
    public static LoginAuthVo toEntity(User user, String token) {
        LoginAuthVo loginAuthVo = new LoginAuthVo();
        loginAuthVo.setId(user.getId().toString());
        loginAuthVo.setUserName(user.getUserName());
        loginAuthVo.setNickName(user.getNickName());
        loginAuthVo.setProfilePhotoUrl(user.getProfilePhotoUrl());
        loginAuthVo.setToken(token);

        return  loginAuthVo;
    }
}
