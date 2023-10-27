package com.xiang.springbootmall.dao;

import com.xiang.springbootmall.constant.ProductCategory;
import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> getProducts(ProductCategory category , String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
