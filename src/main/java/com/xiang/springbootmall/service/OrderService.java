package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.CreateOrderRequest;
import com.xiang.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
