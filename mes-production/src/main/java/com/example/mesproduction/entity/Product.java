package com.example.mesproduction.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// 生产产品
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("production")
public class Product {

    // 产品id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    // 产品名称
    private String name;

    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    // 版本号，用于乐观锁
    @Version
    private Integer version;
}
