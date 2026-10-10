package com.example.mesorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertSalesOrderDto {
    // 销售合同号
    private String contractCode;

    // 创建人（销售人员id）
    private Long creatorId;

    // 客户名称
    private String customerName;

    // 产品id
    private Long prodId;

    // 售卖产品的数量
    private int amount;

    // 截止日期，交货日期
    private LocalDateTime deadline;
}
