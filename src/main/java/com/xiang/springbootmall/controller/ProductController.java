package com.xiang.springbootmall.controller;

import com.xiang.springbootmall.constant.ProductCategory;
import com.xiang.springbootmall.dto.ProductQueryParams;
import com.xiang.springbootmall.dto.ProductRequest;
import com.xiang.springbootmall.model.Product;
import com.xiang.springbootmall.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProdcuts(
            @RequestParam(required = false) ProductCategory category,
            @RequestParam(required = false) String search
    ){
        ProductQueryParams productQueryParams = new ProductQueryParams();
        productQueryParams.setCategory(category);
        productQueryParams.setSearch(search);

        List<Product> productlist = productService.getProducts(productQueryParams);

        return ResponseEntity.status(HttpStatus.OK).body(productlist);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){

        Product product = productService.getProductById(productId);
        Integer product1 = productId;

        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);

    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable  Integer productId,
                                                 @RequestBody @Valid ProductRequest productRequest){

        //檢查product 是否存在
        Product product = productService.getProductById(productId);

        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        //修改商品的數據


        Product updateProduct = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.OK).body(updateProduct);
    }


    @DeleteMapping("/products/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){

        productService.deleteProductById(productId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
