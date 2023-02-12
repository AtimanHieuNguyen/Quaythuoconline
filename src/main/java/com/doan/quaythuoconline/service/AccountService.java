package com.doan.quaythuoconline.service;

import java.util.List;

import com.doan.quaythuoconline.model.Account;

public interface AccountService {
    List<Account> findAll();
    Account findByIdAccount(String id );
    Account findByNameAccount(String nameString);
    Account findBySdtAndPassword(String Sdt, String password);
    Account save(Account account);
    void delete(Account account);
}
