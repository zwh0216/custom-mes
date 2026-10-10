package com.example.mesuser.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.mesuser.constant.MenuTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@TableName("menu")
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    // 菜单的id
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    // 菜单的名称
    private  String name;

    // 菜单的路径
    private  String path;

    // 菜单的中文名称
    private  String title;

    // 菜单的类型
    private MenuTypeEnum type;

    // 菜单的禁用状态
    private Boolean disabled;

    // 菜单的自定义icon
    private String icon;

    // 菜单的父菜单
    private String parent;

    // 菜单的分组
    @TableField("`group`")
    private String group;

    // 版本号
    @Version
    private Integer version;

    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 更新事件
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
