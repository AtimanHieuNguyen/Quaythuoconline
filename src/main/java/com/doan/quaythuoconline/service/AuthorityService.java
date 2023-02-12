package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Authority;

public interface AuthorityService {
    List<Authority> findAll();
    Authority findByIdAuthorityt(String id );
    Authority save(Authority authority);
    void delete(Authority authority);
}
