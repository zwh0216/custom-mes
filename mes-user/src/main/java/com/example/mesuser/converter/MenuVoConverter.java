package com.example.mesuser.converter;

import com.example.mesuser.entity.Menu;
import com.example.mesuser.vo.MenuVo;

public class MenuVoConverter {
    public static MenuVo toVo(Menu menu) {
        MenuVo menuVo = new MenuVo();
        menuVo.setId(menu.getId().toString());
        menuVo.setName(menu.getName());
        menuVo.setPath(menu.getPath());
        menuVo.setTitle(menu.getTitle());
        menuVo.setType(menu.getType());
        menuVo.setDisabled(menu.getDisabled());
        menuVo.setIcon(menu.getIcon());
        menuVo.setParent(menu.getParent());
        menuVo.setGroup(menu.getGroup());
        menuVo.setCreateTime(menu.getCreateTime());
        menuVo.setUpdateTime(menu.getUpdateTime());

        return menuVo;
    }
}
