package com.xiang.springbootmall.dao.impl;

import com.xiang.springbootmall.dao.ProductDao;
import com.xiang.springbootmall.model.Product;
import com.xiang.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {



        String sql = "SELECT product_id, product_name, category, image_url, price, stock, description, created_date, last_modified_date FROM product WHERE product_id = :productId";

        Map<String, Object> map = new HashMap<>();
        map.put("productId" , productId);

        List<Product> list = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if(list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }

    }
}
