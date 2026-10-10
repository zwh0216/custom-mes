package com.example.mesuser.contronller;

import com.example.mescommon.entity.ClaimEntity;
import com.example.mescommon.entity.Result;
import com.example.mescommon.utils.TokenGenerator;
import com.example.mesuser.converter.ClaimEntityConverter;
import com.example.mesuser.converter.LoginAuthVoConverter;
import com.example.mesuser.dto.LoginAuthDto;
import com.example.mesuser.entity.User;
import com.example.mesuser.service.UserService;
import com.example.mesuser.vo.LoginAuthVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthControl {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<LoginAuthVo> login(@RequestBody LoginAuthDto loginDto) {
        log.debug(loginDto.toString());
        User user = userService.findUserByNameAndPw(loginDto.getUserName(), loginDto.getPassword());
        ClaimEntity claimEntity = ClaimEntityConverter.toEntity(user);
        String token = TokenGenerator.generateToken(claimEntity);

        LoginAuthVo loginAuthVo = LoginAuthVoConverter.toEntity(user, token);
        return Result.success(loginAuthVo, "操作成功");
    }
}
