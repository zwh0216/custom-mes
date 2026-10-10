package com.example.mesuser.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginAuthVo {

    // 用户id
    private String id;

    // 用户名称
    private String userName;

    // 用户昵称
    private String nickName;

    // 头像url
    private String profilePhotoUrl;

    // token
    private String token;
}
