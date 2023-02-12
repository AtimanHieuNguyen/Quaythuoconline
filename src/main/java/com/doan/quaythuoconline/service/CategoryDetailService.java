package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.CategorysDetail;

public interface CategoryDetailService {
    List<CategorysDetail> findAll();
    CategorysDetail findById(String id );
    CategorysDetail save(CategorysDetail categorysDetail);
    void delete(CategorysDetail categorysDetail);
}
