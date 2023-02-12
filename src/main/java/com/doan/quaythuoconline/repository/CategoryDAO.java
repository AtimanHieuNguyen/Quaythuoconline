package com.doan.quaythuoconline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Category;


@Repository
public interface CategoryDAO extends JpaRepository<Category,String> {
   
  
}

