package com.example.mesuser.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
// 登录用户
public class UserCreateDto {

    // 用户名
    @NotEmpty
    private String userName;

    // 用户密码
    @NotEmpty
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
