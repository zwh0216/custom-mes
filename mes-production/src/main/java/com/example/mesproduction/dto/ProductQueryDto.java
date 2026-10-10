package com.example.mesproduction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 产品查询入参
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductQueryDto {

    // 产品名称，模糊匹配
    private String name;
}
