package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Role;
import com.doan.quaythuoconline.repository.RoleDAO;
import com.doan.quaythuoconline.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleDAO roleDAO;
    @Override
    public List<Role> findAll() {
        // TODO Auto-generated method stub
        return roleDAO.findAll();
    }

    @Override
    public Role findById(String id) {
        // TODO Auto-generated method stub
        return roleDAO.findById(id).get();
    }

    @Override
    public Role save(Role role) {
        // TODO Auto-generated method stub
        return roleDAO.save(role);
    }

    @Override
    public void delete(Role role) {
        // TODO Auto-generated method stub
        roleDAO.delete(role);
    }
    
}
