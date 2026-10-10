package com.example.mesproduction.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 更新产品入参
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateDto {

    // 产品id
    @NotNull(message = "产品id不能为空")
    private Long id;

    // 产品名称
    @NotBlank(message = "产品名称不能为空")
    @Size(max = 10, message = "产品名称长度不能超过10")
    private String name;

    // 版本号，前端回传用于乐观锁校验
    @NotNull(message = "版本号不能为空")
    private Integer version;
}
