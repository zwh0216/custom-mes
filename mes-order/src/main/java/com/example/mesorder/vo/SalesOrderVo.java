package com.example.mesorder.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesOrderVo {
    // 销售订单的id
    private String id;

    // 生产订单的id
    private String prodOrderId;

    // 销售合同号
    private String contractCode;

    // 创建人（销售人员id）
    private String creatorId;

    // 创建人名称（销售人员）
    private String creatorName;

    // 客户名称
    private String customerName;

    // 产品id
    private String prodId;

    // 产品名称
    private String prodName;

    // 售卖产品的数量
    private int amount;

    // 销售订单的创建时间
    private LocalDateTime createTime;

    // 销售订单的更新时间
    private LocalDateTime updateTime;

    // 截止日期，交货日期
    private LocalDateTime deadline;

    // 版本
    private int version;


}
