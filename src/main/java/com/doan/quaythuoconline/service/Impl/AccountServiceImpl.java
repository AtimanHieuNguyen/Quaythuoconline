package com.doan.quaythuoconline.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doan.quaythuoconline.model.Account;
import com.doan.quaythuoconline.repository.AccountDAO;
import com.doan.quaythuoconline.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;

    @Override
    public List<Account> findAll() {
        // TODO Auto-generated method stub
        return accountDAO.findAll();
    }

    @Override
    public Account findByIdAccount(String id) {
        // TODO Auto-generated method stub
        return accountDAO.findById(id).get();
    }

    @Override
    public Account findByNameAccount(String nameString) {
        // TODO Auto-generated method stub
        return accountDAO.findBynamAccount(nameString);
    }

    @Override
    public Account save(Account account) {
        // TODO Auto-generated method stub
        return accountDAO.save(account);
    }

    @Override
    public void delete(Account account) {
        // TODO Auto-generated method stub
        accountDAO.delete(account);
    }

    @Override
    public Account findBySdtAndPassword(String Sdt, String password) {
        // TODO Auto-generated method stub
        return accountDAO.findBySdtAndPassword(Sdt, password);
    }
    
}
