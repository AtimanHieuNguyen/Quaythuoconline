package com.doan.quaythuoconline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Authority;



@Repository
public interface AuthorityDAO extends JpaRepository<Authority,String> {
   
  
}


