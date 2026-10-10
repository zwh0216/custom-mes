package com.example.mesproduction.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mesproduction.dto.ProductQueryDto;
import com.example.mesproduction.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {

    // 按条件查询产品列表
    List<Product> findProductList(ProductQueryDto query);
}
