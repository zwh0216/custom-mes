package com.example.mesuser.vo;

import com.example.mesuser.constant.MenuTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVo {
    // 菜单的id
    private String id;

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
    private String group;

    // 版本号
    private Integer version;

    // 子节点
    private List<MenuVo> children;

    // 创建时间
    private LocalDateTime createTime;

    // 更新事件
    private LocalDateTime updateTime;
}
