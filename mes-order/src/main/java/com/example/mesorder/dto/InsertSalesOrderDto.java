package com.example.mesorder.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertSalesOrderDto {
    // 销售合同号
    @NotEmpty(message = "销售合同号不能为空")
    private String contractCode;

    // 创建人（销售人员id）
    @NotNull(message = "创建人不能为空")
    private String creatorId;

    // 客户名称
    @NotEmpty(message = "客户不能为空")
    private String customerName;

    // 产品id
    @NotNull(message = "产品不能为空")
    private String prodId;

    // 售卖产品的数量
    @NotNull(message = "请输入售卖产品数量")
    private int amount;

    // 截止日期，交货日期
    @NotNull(message = "交货日期不能为空")
    private LocalDateTime deadline;
}
