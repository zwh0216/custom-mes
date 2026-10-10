package com.example.mesproduction.converter;

import com.example.mesproduction.dto.ProductCreateDto;
import com.example.mesproduction.dto.ProductUpdateDto;
import com.example.mesproduction.entity.Product;

public class ProductEntityConverter {

    public static Product toEntity(ProductCreateDto productCreateDto) {
        Product product = new Product();
        product.setName(productCreateDto.getName());
        product.setVersion(0);
        return product;
    }

    public static Product toEntity(ProductUpdateDto productUpdateDto) {
        Product product = new Product();
        product.setId(productUpdateDto.getId());
        product.setName(productUpdateDto.getName());
        product.setVersion(productUpdateDto.getVersion());
        return product;
    }
}
