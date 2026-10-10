package com.example.mesproduction.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 新增产品入参
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto {

    // 产品名称
    @NotBlank(message = "产品名称不能为空")
    @Size(max = 10, message = "产品名称长度不能超过10")
    private String name;
}
