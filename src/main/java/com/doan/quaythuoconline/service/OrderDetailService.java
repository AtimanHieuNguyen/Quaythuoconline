package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.OrderDetail;

public interface OrderDetailService {
    List<OrderDetail> findAll();
    OrderDetail findById(String id );
    OrderDetail save(OrderDetail orderDetail);
    void delete(OrderDetail orderDetail);
}
