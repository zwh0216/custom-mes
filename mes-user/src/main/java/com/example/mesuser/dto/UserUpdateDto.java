package com.example.mesuser.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
// 登录用户
public class UserUpdateDto {
    // id
    @NotNull(message = "id不能为空")
    private Long id;

    // 用户名
    @NotEmpty(message = "用户名不能为空")
    private String userName;

    // 用户密码
    @NotEmpty(message = "用户密码不能为空")
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
