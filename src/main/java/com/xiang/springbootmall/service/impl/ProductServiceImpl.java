package com.xiang.springbootmall.service.impl;

import com.xiang.springbootmall.constant.ProductCategory;
import com.xiang.springbootmall.dao.ProductDao;
import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;
import com.xiang.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCategory Category, String search) {
        return productDao.getProducts(Category , search);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return  productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
