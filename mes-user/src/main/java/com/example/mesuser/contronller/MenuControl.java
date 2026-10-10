package com.example.mesuser.contronller;

import com.example.mescommon.entity.Result;
import com.example.mesuser.service.MenuService;
import com.example.mesuser.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuControl {

    @Autowired
    MenuService menuService;

    @GetMapping("/query")
    public Result<List<MenuVo>> findAllMenus () {
        List<MenuVo> menus =  menuService.findAllMenus();
        return Result.success(menus, "操作成功");
    }
}
