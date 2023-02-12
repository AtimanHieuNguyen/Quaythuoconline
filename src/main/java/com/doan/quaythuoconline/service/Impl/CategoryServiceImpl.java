package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Category;
import com.doan.quaythuoconline.repository.CategoryDAO;
import com.doan.quaythuoconline.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO categoryDAO;
    @Override
    public List<Category> findAll() {
        // TODO Auto-generated method stub
        return categoryDAO.findAll();
    }

    @Override
    public Category findById(String id) {
        // TODO Auto-generated method stub
        return categoryDAO.findById(id).get();
    }

    @Override
    public Category save(Category category) {
        // TODO Auto-generated method stub
        return categoryDAO.save(category);
    }

    @Override
    public void delete(Category category) {
        // TODO Auto-generated method stub
        categoryDAO.delete(category);
    }
    
}
