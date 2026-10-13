package com.example.mesorder.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ApprovalStatusEnum {
    Pending("Pending", "待审批"), // 待审批
    Approving("Approving", "审批中"), // 审批中
    Approved("Approved", "已审批"); // 已审批

    // 审批状态的value
    @EnumValue
    private final String value;

    // 审批状态的文案
    private final String label;

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
        for (ApprovalStatusEnum status : values()) {
            if (status.value.equals(value)) {
                return status;
            }
        }

        throw new IllegalArgumentException("无效的订单状态：" + value);
    }
}
