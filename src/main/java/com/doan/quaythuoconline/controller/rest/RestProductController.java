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

import com.doan.quaythuoconline.model.Product;

import com.doan.quaythuoconline.service.ProductService;

@RestController
public class RestProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/rest/product/all")
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/rest/product/{id}")
    public Product findById(@PathVariable("id") String id ){
        return productService.findById(id);
    }

    @PostMapping("/rest/product")
    public Product post(@RequestBody Product product){
        return productService.save(product);
    } 

    @PutMapping("/rest/product/{id}")
    public Product put(@PathVariable("id") String id, @RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/rest/product/{id}")
    public void delete(@PathVariable("id") String id){
        productService.delete(productService.findById(id));
    }                                  
}
