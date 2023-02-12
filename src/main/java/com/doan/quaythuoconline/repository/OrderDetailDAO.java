package com.doan.quaythuoconline.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.OrderDetail;



@Repository
public interface OrderDetailDAO extends JpaRepository<OrderDetail,String> {
   
  
}

