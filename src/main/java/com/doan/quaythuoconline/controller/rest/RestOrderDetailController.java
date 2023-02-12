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

import com.doan.quaythuoconline.model.OrderDetail;
import com.doan.quaythuoconline.service.OrderDetailService;

@RestController
public class RestOrderDetailController {
    @Autowired
    private OrderDetailService detailService;

    @GetMapping("/rest/orderdetail/all")
    public List<OrderDetail> findAll(){
        return detailService.findAll();
    }
    @GetMapping("/rest/orderdetail/{id}")
    public OrderDetail findById(@PathVariable("id") String id ){
        return detailService.findById(id);
    }

    @PostMapping("/rest/orderdetail")
    public OrderDetail post(@RequestBody OrderDetail orderDetail){
        return detailService.save(orderDetail);
    } 

    @PutMapping("/rest/orderdetail/{id}")
    public OrderDetail put(@PathVariable("id") String id, @RequestBody OrderDetail orderDetail){
        return detailService.save(orderDetail);
    }

    @DeleteMapping("/rest/orderdetail/{id}")
    public void delete(@PathVariable("id") String id){
        detailService.delete(detailService.findById(id));
    }
}
