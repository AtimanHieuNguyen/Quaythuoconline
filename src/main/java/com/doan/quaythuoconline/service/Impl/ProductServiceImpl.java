package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Product;
import com.doan.quaythuoconline.repository.ProductDAO;
import com.doan.quaythuoconline.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO productDAO;


    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return productDAO.findAll();
    }

    @Override
    public Product findById(String id) {
        // TODO Auto-generated method stub
        return productDAO.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        // TODO Auto-generated method stub
        return productDAO.save(product);
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        productDAO.delete(product);
    }
    
}
