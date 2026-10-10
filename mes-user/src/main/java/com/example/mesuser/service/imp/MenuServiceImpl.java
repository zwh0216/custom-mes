package com.example.mesuser.service.imp;

import com.example.mescommon.utils.ListUtils;
import com.example.mesuser.converter.MenuVoConverter;
import com.example.mesuser.entity.Menu;
import com.example.mesuser.mapper.MenuMapper;
import com.example.mesuser.service.MenuService;
import com.example.mesuser.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<MenuVo> findAllMenus() {
        List<Menu> menuList = menuMapper.selectList(null);
        List<MenuVo> menuVos = menuList.stream().map(MenuVoConverter::toVo).toList();
        log.info("获取所有菜单：" + menuVos.toString());

        List<MenuVo> menuTree = ListUtils.list2Tree(menuVos, MenuVo::getName, MenuVo::getParent, MenuVo::getChildren, MenuVo::setChildren);

        return menuTree;
    }
}
