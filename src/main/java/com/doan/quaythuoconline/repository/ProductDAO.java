package com.doan.quaythuoconline.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Product;


@Repository
public interface ProductDAO extends JpaRepository<Product,String> {
   
  
}
