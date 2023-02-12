package com.doan.quaythuoconline.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doan.quaythuoconline.model.Authority;
import com.doan.quaythuoconline.service.AuthorityService;



@RestController
public class RestAuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/rest/authority/all")
    public List<Authority> findAll(){
        return authorityService.findAll();
    }

    @PostMapping("/rest/authority")
    public Authority post(@RequestBody Authority authority){
        return authorityService.save(authority);
    } 

    @PutMapping("/rest/authority/{id}")
    public Authority put(@PathVariable("id") String id, @RequestBody Authority authority){
        return authorityService.save(authority);
    }

    @DeleteMapping("/rest/authority/{id}")
    public void delete(@PathVariable("id") String id){
        authorityService.delete(authorityService.findByIdAuthorityt(id));
    }
}
