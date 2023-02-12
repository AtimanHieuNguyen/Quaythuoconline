package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Category;

public interface CategoryService {
    List<Category> findAll();
    Category findById(String id );
    Category save(Category category);
    void delete(Category category);
}
