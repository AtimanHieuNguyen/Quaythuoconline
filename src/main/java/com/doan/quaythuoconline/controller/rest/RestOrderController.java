package com.doan.quaythuoconline.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doan.quaythuoconline.model.Order;
import com.doan.quaythuoconline.service.OrderService;

@RestController
public class RestOrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/rest/order/all")
    public List<Order> findAll(){
        return orderService.findAll();
    }
    @GetMapping("/rest/order/{id}")
    public Order findById(@PathVariable("id") String id ){
        return orderService.findById(id);
    }

    @PostMapping("/rest/order")
    public Order post(@RequestBody Order order){
        return orderService.save(order);
    } 

    @PutMapping("/rest/order/{id}")
    public Order put(@PathVariable("id") String id, @RequestBody Order order){
        return orderService.save(order);
    }

    @DeleteMapping("/rest/order/{id}")
    public void delete(@PathVariable("id") String id){
        orderService.delete(orderService.findById(id));
    }
}
