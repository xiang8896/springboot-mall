package com.xiang.springbootmall.dao;

import com.xiang.springbootmall.dto.OrderQueryParams;
import com.xiang.springbootmall.model.Order;
import com.xiang.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {


    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
