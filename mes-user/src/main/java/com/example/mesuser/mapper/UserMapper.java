package com.example.mesuser.mapper;

import com.example.mesuser.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    // 通过用户id查询用户
    @Select("select id, name userName, update_time, create_time, password, nick_name, profile_photo_url from user " +
            "where id = #{userId}")
    User findUserById(Long userId);

    // 通过账号密码查询用户
    @Select("select id, name userName, update_time, create_time, password, nick_name, profile_photo_url from user " +
            "where name = #{userName} and password = #{password}")
    User findUserByNameAndPs(String userName, String password);

    // 添加用户
    int createUser(User user);

    // 删除用户
    @Delete("delete from user where id = #{userId}")
    int deleteUser(Long userId);

    // 更新用户
    int updateUser(User user);
}
