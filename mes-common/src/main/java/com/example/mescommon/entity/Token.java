package com.example.mescommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    // 用户id
    private Long id;

    // 用户名
    private String userName;

    // 昵称
    private String nickName;

    // 头像url
    private String profilePhotoUrl;
}
