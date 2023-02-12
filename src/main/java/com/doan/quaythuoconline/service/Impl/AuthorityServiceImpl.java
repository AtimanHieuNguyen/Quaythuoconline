package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Authority;
import com.doan.quaythuoconline.repository.AuthorityDAO;
import com.doan.quaythuoconline.service.AuthorityService;
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityDAO authorityDAO;
    @Override
    public List<Authority> findAll() {
        // TODO Auto-generated method stub
        return authorityDAO.findAll();
    }

    @Override
    public Authority findByIdAuthorityt(String id) {
        // TODO Auto-generated method stub
        return authorityDAO.findById(id).get();
    }

    @Override
    public Authority save(Authority authority) {
        // TODO Auto-generated method stub
        return authorityDAO.save(authority);
    }

    @Override
    public void delete(Authority authority) {
        // TODO Auto-generated method stub
        authorityDAO.delete(authority);
    }
    
}
