package com.doan.quaythuoconline.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Role;


@Repository
public interface RoleDAO extends JpaRepository<Role,String> {
   
}

