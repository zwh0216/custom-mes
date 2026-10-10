package com.example.mescommon.exception;


import com.example.mescommon.constant.CodeEnum;
import com.example.mescommon.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Result businessExceptionHandler (BusinessException err) {
        log.error("业务异常", err);
        return Result.error(err.getCode().getCode(), err.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler (Exception err) {
        log.error("系统未知异常", err);
        return Result.error(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage());
    }
}
