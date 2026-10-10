package com.example.mesuser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mesuser.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    @Select("select id, name, path, title, type, disabled, icon, parent, `group`, create_time, update_time from menu")
    List<Menu> findAllMenus();
}
