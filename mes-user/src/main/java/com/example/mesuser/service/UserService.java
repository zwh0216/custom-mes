package com.example.mesuser.service;


import com.example.mesuser.dto.UserCreateDto;
import com.example.mesuser.dto.UserUpdateDto;
import com.example.mesuser.entity.User;

public interface UserService {

    // 通过密码用户名查询用户
    User findUserByNameAndPw(String userName, String password);

    // 新增用户
    boolean addNewUser(UserCreateDto userCreateDto);

    // 删除用户
    boolean deleteUserById(Long userId);

    // 修改用户
    User updateUser(UserUpdateDto user);

}
