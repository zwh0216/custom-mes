package com.example.mescommon.exception;

import com.example.mescommon.constant.CodeEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    // 错误码
    private CodeEnum code;

    BusinessException(Integer code, String message){
        super(message);
        for (CodeEnum errorCode : CodeEnum.values()){
            if(errorCode.getCode() == code){
                this.code = errorCode;
            }
        }
    }

    BusinessException(CodeEnum code){
        super(code.getMessage());
        this.code = code;
    }
}
