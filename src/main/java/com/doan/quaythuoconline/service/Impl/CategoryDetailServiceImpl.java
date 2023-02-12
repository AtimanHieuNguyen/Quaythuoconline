package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.CategorysDetail;

import com.doan.quaythuoconline.repository.CategoryDetailDAO;
import com.doan.quaythuoconline.service.CategoryDetailService;
@Service
public class CategoryDetailServiceImpl implements CategoryDetailService {
    @Autowired 
    CategoryDetailDAO categoryDetailDAO;
    @Override
    public List<CategorysDetail> findAll() {
        // TODO Auto-generated method stub
        return categoryDetailDAO.findAll();
    }

    @Override
    public CategorysDetail findById(String id) {
        // TODO Auto-generated method stub
        return categoryDetailDAO.findById(id).get();
    }

    @Override
    public CategorysDetail save(CategorysDetail categorysDetail) {
        // TODO Auto-generated method stub
        return categoryDetailDAO.save(categorysDetail);
    }

    @Override
    public void delete(CategorysDetail categorysDetail) {
        // TODO Auto-generated method stub
        categoryDetailDAO.delete(categorysDetail);
    }
   
}
