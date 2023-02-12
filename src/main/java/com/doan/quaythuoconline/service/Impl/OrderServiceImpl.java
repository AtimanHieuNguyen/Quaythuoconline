package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Order;
import com.doan.quaythuoconline.repository.OrderDAO;
import com.doan.quaythuoconline.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO orderDAO;
    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        return orderDAO.findAll();
    }

    @Override
    public Order findById(String id) {
        // TODO Auto-generated method stub
        return orderDAO.findById(id).get();
    }

    @Override
    public Order save(Order order) {
        // TODO Auto-generated method stub
        return orderDAO.save(order);
    }

    @Override
    public void delete(Order order) {
        // TODO Auto-generated method stub
        orderDAO.delete(order);
    }
    
}
