package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(String id );
    Product save(Product product);
    void delete(Product product);
}
