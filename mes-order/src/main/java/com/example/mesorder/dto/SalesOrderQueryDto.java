package com.example.mesorder.dto;

import com.example.mesorder.constant.ApprovalStatusEnum;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesOrderQueryDto {
    // 审批状态
    @NotNull(message = "审批状态不能为空")
    private ApprovalStatusEnum status;

    // 生产订单的id
    private Long prodOrderId;

    // 销售合同号
    private String contractCode;

    // 创建人名称（销售人员）
    private String creatorName;

    // 客户名称
    private String customerName;

    // 产品名称
    private String prodId;

    // 销售订单的创建时间
    private LocalDateTime createTime;

    // 截止日期，交货日期
    private LocalDateTime deadline;
}
