package com.example.mescommon.entity;

import com.example.mescommon.constant.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    // 业务编码
    private Integer code;

    // 返回结果
    private T data;

    // 返回消息
    private String msg;

    // 正确的响应
    public static <V> Result<V> success (V data, String msg){
        return new Result<>(CodeEnum.SUCCESS.getCode(), data, msg);
    }

    // 错误响应
    public static <V> Result<V> error(String msg){
        return  new Result<>(CodeEnum.ERROR.getCode(), null, msg);
    }

    // 自定义错误码的错误响应
    public static <V> Result<V> error(Integer code, String msg){
        return  new Result<>(code, null, msg);
    }
}
