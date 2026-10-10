package com.example.mesproduction.controller;

import com.example.mescommon.entity.Result;
import com.example.mesproduction.dto.ProductCreateDto;
import com.example.mesproduction.dto.ProductQueryDto;
import com.example.mesproduction.dto.ProductUpdateDto;
import com.example.mesproduction.service.ProductService;
import com.example.mesproduction.vo.ProductVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductControl {

    @Autowired
    private ProductService productService;

    // 查询产品列表（name可选，模糊匹配）
    @GetMapping("/query")
    public Result<List<ProductVo>> queryProduct(ProductQueryDto query) {
        List<ProductVo> productList = productService.listProducts(query);
        return Result.success(productList, "查询成功");
    }

    // 查询产品详情
    @GetMapping("/{id}")
    public Result<ProductVo> getProduct(@PathVariable("id") Long id) {
        ProductVo product = productService.getProductById(id);
        if (product == null) {
            return Result.error("产品不存在");
        }
        return Result.success(product, "查询成功");
    }

    // 新增产品
    @PostMapping("/add")
    public Result<Void> addProduct(@Valid @RequestBody ProductCreateDto product) {
        if (productService.createProduct(product)) {
            return Result.success(null, "新增成功");
        }
        return Result.error("新增失败");
    }

    // 更新产品
    @PostMapping("/update")
    public Result<Void> updateProduct(@Valid @RequestBody ProductUpdateDto product) {
        if (productService.updateProduct(product)) {
            return Result.success(null, "更新成功");
        }
        return Result.error("更新失败，产品不存在或已被修改");
    }

    // 删除产品
    @DeleteMapping("/delete/{id}")
    public Result<Void> deleteProduct(@PathVariable("id") Long id) {
        if (productService.deleteProductById(id)) {
            return Result.success(null, "删除成功");
        }
        return Result.error("删除失败，产品不存在");
    }
}
