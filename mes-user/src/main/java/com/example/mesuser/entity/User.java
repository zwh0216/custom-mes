package com.example.mesuser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 登录用户
public class User {

    // id
    private Long id;

    // 用户名
    private String userName;

    // 用户密码
    private String password;

    // 昵称
    private String nickName;

    // 头像url
    private String profilePhotoUrl;

    // 更新时间
    private LocalDateTime updateTime;

    // 创建时间
    private LocalDateTime createTime;
}
