package com.example.mesuser.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MenuTypeEnum {
    // 分组类型菜单
    GROUP(0),

    // 叶子节点菜单
    LEAF(1);

    @EnumValue
    private final Integer key;
}
