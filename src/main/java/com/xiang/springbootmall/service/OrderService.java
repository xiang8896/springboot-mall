package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.CreateOrderRequest;
import com.xiang.springbootmall.dto.OrderQueryParams;
import com.xiang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
