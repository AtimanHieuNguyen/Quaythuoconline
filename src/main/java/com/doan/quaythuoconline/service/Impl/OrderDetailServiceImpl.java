package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.OrderDetail;
import com.doan.quaythuoconline.repository.OrderDetailDAO;
import com.doan.quaythuoconline.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl implements OrderDetailService{
    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Override
    public List<OrderDetail> findAll() {
        // TODO Auto-generated method stub
        return orderDetailDAO.findAll();
    }

    @Override
    public OrderDetail findById(String id) {
        // TODO Auto-generated method stub
        return orderDetailDAO.findById(id).get();
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        // TODO Auto-generated method stub
        return orderDetailDAO.save(orderDetail);
    }

    @Override
    public void delete(OrderDetail orderDetail) {
        // TODO Auto-generated method stub
        orderDetailDAO.delete(orderDetail);
    }
    
}
