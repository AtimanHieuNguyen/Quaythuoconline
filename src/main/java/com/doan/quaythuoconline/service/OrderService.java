package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Order;

public interface OrderService {
    List<Order> findAll();
    Order findById(String id );
    Order save(Order order);
    void delete(Order order);
}
