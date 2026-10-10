package com.example.mesproduction.service.impl;

import com.example.mesproduction.converter.ProductEntityConverter;
import com.example.mesproduction.converter.ProductVoConverter;
import com.example.mesproduction.dto.ProductCreateDto;
import com.example.mesproduction.dto.ProductQueryDto;
import com.example.mesproduction.dto.ProductUpdateDto;
import com.example.mesproduction.entity.Product;
import com.example.mesproduction.mapper.ProductMapper;
import com.example.mesproduction.service.ProductService;
import com.example.mesproduction.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductVo> listProducts(ProductQueryDto query) {
        List<Product> productList = productMapper.findProductList(query);
        return productList.stream().map(ProductVoConverter::toVo).toList();
    }

    @Override
    public ProductVo getProductById(Long id) {
        Product product = productMapper.selectById(id);
        if (product == null) {
            return null;
        }
        return ProductVoConverter.toVo(product);
    }

    @Override
    public boolean createProduct(ProductCreateDto productCreateDto) {
        Product product = ProductEntityConverter.toEntity(productCreateDto);
        return productMapper.insert(product) > 0;
    }

    @Override
    public boolean updateProduct(ProductUpdateDto productUpdateDto) {
        Product product = ProductEntityConverter.toEntity(productUpdateDto);
        // 带上version更新，由乐观锁插件校验版本并在命中时自增
        return productMapper.updateById(product) > 0;
    }

    @Override
    public boolean deleteProductById(Long id) {
        return productMapper.deleteById(id) > 0;
    }
}
