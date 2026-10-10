package com.example.mesproduction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private Integer id;
    private String name;
    private String key;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
}
