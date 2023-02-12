package com.doan.quaythuoconline.controller.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doan.quaythuoconline.model.Account;
import com.doan.quaythuoconline.service.AccountService;

import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class RestAccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/rest/account/all")
    public List<Account> findALl(){
        return accountService.findAll();
    }

    @GetMapping("/rest/account/{id}")
    public Account findById(@PathVariable("id") String id ){
        return accountService.findByIdAccount(id);
    }

    @PostMapping("/rest/account")
    public void save(@RequestBody Account account){
        accountService.save(account);
    }

    @PutMapping("/rest/account/{id}")
    public void put(@PathVariable("id") String id, @RequestBody Account account) {
        //TODO: process PUT request 
       Account acc =  accountService.findByIdAccount(id);
       accountService.save(acc);
    }
    

    @DeleteMapping("/rest/account/{id}")
    public void delete(@PathVariable("id") String id){
        accountService.delete(accountService.findByIdAccount(id));
    }
}
