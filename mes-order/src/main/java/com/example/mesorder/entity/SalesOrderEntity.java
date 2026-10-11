package com.example.mesorder.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.mesorder.constant.ApprovalStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sales_order")
public class SalesOrderEntity {
    // 销售订单的id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    // 生产订单的id
    private Long prodOrderId;

    // 销售合同号
    private String contractCode;

    // 创建人（销售人员id）
    private Long creatorId;

    // 创建人名称（销售人员）
    private String creatorName;

    // 客户名称
    private String customerName;

    // 产品id
    private Long prodId;

    // 产品名称
    private String prodName;

    // 售卖产品的数量
    private int amount;

    // 当前销售订单的状态
    private ApprovalStatusEnum status;

    // 销售订单的创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 销售订单的更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    // 截止日期，交货日期
    private LocalDateTime deadline;

    // 版本
    @Version
    private int version;
}
