package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public Product getProductById(Integer productId);

    public Integer createProduct(ProductRequest productRequest);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);
}
