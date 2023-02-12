package com.doan.quaythuoconline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.CategorysDetail;


@Repository
public interface CategoryDetailDAO extends JpaRepository<CategorysDetail,String> {
   
  
}


