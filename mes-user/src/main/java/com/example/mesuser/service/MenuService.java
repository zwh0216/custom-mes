package com.example.mesuser.service;

import com.example.mesuser.vo.MenuVo;

import java.util.List;

public interface MenuService {
    List<MenuVo> findAllMenus();
}
