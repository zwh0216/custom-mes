package com.example.mesproduction.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// 产品返回结果
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVo {

    // 产品id，雪花id超出前端安全整数范围，统一转成字符串
    private String id;

    // 产品名称
    private String name;

    // 创建时间
    private LocalDateTime createTime;

    // 更新时间
    private LocalDateTime updateTime;

    // 版本号
    private Integer version;
}
