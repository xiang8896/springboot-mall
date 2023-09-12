package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;

public interface ProductService {
    public Product getProductById(Integer productId);

    public Integer createProduct(ProductRequest productRequest);
}
