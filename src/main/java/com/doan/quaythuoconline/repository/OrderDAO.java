package com.doan.quaythuoconline.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Order;


@Repository
public interface OrderDAO extends JpaRepository<Order,String> {
   
  
}

