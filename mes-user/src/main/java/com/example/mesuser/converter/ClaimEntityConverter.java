package com.example.mesuser.converter;

import com.example.mescommon.entity.ClaimEntity;
import com.example.mesuser.entity.User;

public class ClaimEntityConverter {
    public static ClaimEntity toEntity(User user) {
        ClaimEntity claimEntity = new ClaimEntity();
        claimEntity.setId(user.getId());
        claimEntity.setPassword(user.getPassword());
        claimEntity.setNickName(user.getNickName());
        claimEntity.setUserName(user.getUserName());
        claimEntity.setProfilePhotoUrl(user.getProfilePhotoUrl());
        claimEntity.setCreateTime(user.getCreateTime());
        claimEntity.setUpdateTime(user.getUpdateTime());

        return claimEntity;
    }
}
