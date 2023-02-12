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

import com.doan.quaythuoconline.model.Role;
import com.doan.quaythuoconline.service.RoleService;

@RestController
public class RestRoleComtroller {
    @Autowired
    private RoleService roleService;

    @GetMapping("/rest/role/all")
    public List<Role> findALl(){
        return roleService.findAll();
    }

    @GetMapping("/rest/role/{id}")
    public Role findById(@PathVariable("id") String id ){
        return roleService.findById(id);
    }

    @PostMapping("/rest/role")
    public void save(@RequestBody Role account){
        roleService.save(account);
    }

    @PutMapping("/rest/role/{id}")
    public void put(@PathVariable("id") String id, @RequestBody Role account) {
        //TODO: process PUT request 
       Role acc =  roleService.findById(id);
       roleService.save(acc);
    }
    

    @DeleteMapping("/rest/role/{id}")
    public void delete(@PathVariable("id") String id){
        roleService.delete(roleService.findById(id));
    }
}
