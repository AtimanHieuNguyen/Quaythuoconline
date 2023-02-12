package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Role;

public interface RoleService {
    List<Role> findAll();
    Role findById(String id );
    Role save(Role role);
    void delete(Role role);
}
