package com.example.mesproduction.service;

import com.example.mesproduction.dto.ProductCreateDto;
import com.example.mesproduction.dto.ProductQueryDto;
import com.example.mesproduction.dto.ProductUpdateDto;
import com.example.mesproduction.vo.ProductVo;

import java.util.List;

public interface ProductService {

    // 按条件查询产品列表
    List<ProductVo> listProducts(ProductQueryDto query);

    // 通过id查询产品
    ProductVo getProductById(Long id);

    // 新增产品
    boolean createProduct(ProductCreateDto productCreateDto);

    // 更新产品
    boolean updateProduct(ProductUpdateDto productUpdateDto);

    // 删除产品
    boolean deleteProductById(Long id);
}
