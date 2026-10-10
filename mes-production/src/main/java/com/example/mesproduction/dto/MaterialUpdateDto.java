package com.example.mesproduction.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MaterialUpdateDto {
    @NotNull(message = "id不能为空")
    private Integer id;

    @NotBlank(message = "name不能为空")
    private String name;

    @NotBlank(message = "key不能为空")
    private String key;
}
