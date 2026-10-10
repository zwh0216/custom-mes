package com.example.mescommon.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CodeEnum {
    // 通用错误码
    SUCCESS(200, "操作成功"),
    NO_AUTH(403, "没有权限"),
    ERROR(500, "服务异常"),

    // 订单相关的错误码
    ORDER_NOT_FOUND(10001, "未找到订单"),
    CREATE_ORDER_FAIL(10002, "订单创建失败");

    // 错误码
    private final int code;

    // 错误消息
    private final String message;

    @JsonCreator
    public static CodeEnum fromValue(Integer code) {
        for (CodeEnum codeIns : values()) {
            if (codeIns.code == code) {
                return codeIns;
            }
        }

        throw new IllegalArgumentException("无效的订单状态：" + code);
    }

}
