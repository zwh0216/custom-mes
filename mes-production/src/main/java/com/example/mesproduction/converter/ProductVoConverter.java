package com.example.mesproduction.converter;

import com.example.mesproduction.entity.Product;
import com.example.mesproduction.vo.ProductVo;

public class ProductVoConverter {

    public static ProductVo toVo(Product product) {
        ProductVo productVo = new ProductVo();
        productVo.setId(product.getId() == null ? null : product.getId().toString());
        productVo.setName(product.getName());
        productVo.setCreateTime(product.getCreateTime());
        productVo.setUpdateTime(product.getUpdateTime());
        productVo.setVersion(product.getVersion());
        return productVo;
    }
}
