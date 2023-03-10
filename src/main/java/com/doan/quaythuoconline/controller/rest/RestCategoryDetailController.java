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


import com.doan.quaythuoconline.model.CategorysDetail;
import com.doan.quaythuoconline.service.CategoryDetailService;

@RestController
public class RestCategoryDetailController {
    @Autowired
    private CategoryDetailService categoryDetailService;

    @GetMapping("/rest/categoryDetail/all")
    public List<CategorysDetail> findAll(){
        return categoryDetailService.findAll();
    }
    @GetMapping("/rest/categoryDetail/{id}")
    public CategorysDetail findById(@PathVariable("id") String id ){
        return categoryDetailService.findById(id);
    }

    @PostMapping("/rest/categoryDetail")
    public CategorysDetail post(@RequestBody CategorysDetail categorysDetail){
        return categoryDetailService.save(categorysDetail);
    } 

    @PutMapping("/rest/categoryDetail/{id}")
    public CategorysDetail put(@PathVariable("id") String id, @RequestBody CategorysDetail categorysDetail){
        return categoryDetailService.save(categorysDetail);
    }

    @DeleteMapping("/rest/categoryDetail/{id}")
    public void delete(@PathVariable("id") String id){
        categoryDetailService.delete(categoryDetailService.findById(id));
    }
}
