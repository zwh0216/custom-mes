package com.example.mesorder.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatusEnum {
    // 待审批
    Pending("Pending", "待审批"), // 审批中
    Approving("Approving", "待审批"), // 已审批
    Approved("Approved", "待审批"), // 待我审批
    WaitForMyApprove("WaitForMyApprove", "待审批");

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
