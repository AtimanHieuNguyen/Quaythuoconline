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

import com.doan.quaythuoconline.model.Category;
import com.doan.quaythuoconline.service.CategoryService;

@RestController
public class RestCategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/rest/category/all")
    public List<Category> findAll(){
        return categoryService.findAll();
    }
    @GetMapping("/rest/category/{id}")
    public Category findById(@PathVariable("id") String id ){
        return categoryService.findById(id);
    }

    @PostMapping("/rest/category")
    public Category post(@RequestBody Category category){
        return categoryService.save(category);
    } 

    @PutMapping("/rest/category/{id}")
    public Category put(@PathVariable("id") String id, @RequestBody Category category){
        return categoryService.save(category);
    }

    @DeleteMapping("/rest/category/{id}")
    public void delete(@PathVariable("id") String id){
        categoryService.delete(categoryService.findById(id));
    }
}
