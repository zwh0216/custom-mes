package com.example.mesuser.contronller;

import com.example.mescommon.entity.Result;
import com.example.mesuser.dto.UserCreateDto;
import com.example.mesuser.dto.UserUpdateDto;
import com.example.mesuser.entity.User;
import com.example.mesuser.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserControl {
    final UserService userService;

    public UserControl(UserService userService) {
        this.userService = userService;
    }

    // 添加用户
    @PutMapping("/add")
    public Result<Void> addUser(@RequestBody UserCreateDto userCreateDto) {
        try {
            // 新增用户
            boolean res = userService.addNewUser(userCreateDto);
            if (res) {
                return Result.success(null, "操作成功");
            }
            return Result.error("操作失败");
        }catch (Exception err){
            return Result.error("操作失败");
        }
    }

    // 删除用户
    @DeleteMapping("/delete")
    public Result<Void> deleteUser(@RequestParam Long userId) {
        try {
            userService.deleteUserById(userId);
            return Result.success(null, "删除成功");
        } catch (Exception error) {
            return Result.error("删除失败");
        }
    }

    // 更新用户
    @PostMapping("/update")
    public Result<User> updateUser(@RequestBody @Valid UserUpdateDto userUpdateDto) {
        try {
            User user = userService.updateUser(userUpdateDto);
            return Result.success(user, "操作成功");

        } catch (Exception err) {
            return Result.error("操作失败");
        }
    }
}
