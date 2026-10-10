package com.example.mesproduction.controller;

import com.example.mescommon.entity.Result;
import com.example.mesproduction.dto.MaterialUpdateDto;
import com.example.mesproduction.entity.Material;
import com.example.mesproduction.service.MaterialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/material")
public class MaterialControl {

    @Autowired
    MaterialService materialService;

    // 查询所有
    @RequestMapping(path = "/query", method = RequestMethod.GET)
    public Result<List<Material>> queryMaterial() {
        List<Material> materialList = materialService.getAllMaterial();
        return Result.success(materialList, "查询成功");
    }

    // 新增单条数据
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Result addMaterial(@Valid @RequestBody MaterialUpdateDto material) {
        try {
            materialService.insertMaterial(material);
            return Result.success(null, "新增成功");
        } catch (Error err) {
            return Result.error("新增失败");
        }
    }

    // 删除单条数据
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteMaterial(@PathVariable("id") Integer id) {
        try {
            materialService.deleteMaterial(id);
            return Result.success(null, "删除成功");
        } catch (Error err) {
            return Result.error("删除失败");
        }
    }

    // 更新单条数据
    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public Result updateMaterial(@Valid @RequestBody MaterialUpdateDto material) {
        try {
            materialService.updateMaterial(material);
            return Result.success(material, "更新成功");
        } catch (Error err) {
            return Result.error("更新失败");
        }
    }
}
