package com.example.mesuser.service.imp;

import com.example.mescommon.utils.IdGenerator;
import com.example.mesuser.converter.UserConverter;
import com.example.mesuser.dto.UserCreateDto;
import com.example.mesuser.dto.UserUpdateDto;
import com.example.mesuser.entity.User;
import com.example.mesuser.mapper.UserMapper;
import com.example.mesuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IdGenerator idGenerator;

    @Override
    public User findUserByNameAndPw(String userName, String password) {
        return userMapper.findUserByNameAndPs(userName, password);
    }

    @Override
    public boolean addNewUser(UserCreateDto userCreateDto) {
        // 转换成用户实例
        User user = UserConverter.toEntity(userCreateDto);
        user.setId(idGenerator.generateId());
        int res = userMapper.createUser(user);
        return res > 0;
    }

    @Override
    public boolean deleteUserById(Long userId) {
        int res = userMapper.deleteUser(userId);
        return res > 0;
    }

    @Override
    public User updateUser(UserUpdateDto userUpdateDto) {
        User user = UserConverter.toEntity(userUpdateDto);

        int res = userMapper.updateUser(user);
        if(res > 0){
            return user;
        }

        return null;
    }
}
