package com.doan.quaythuoconline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doan.quaythuoconline.model.Account;




@Repository
public interface AccountDAO extends JpaRepository<Account,String> {
    @Query("SELECT o FROM Account o WHERE o.name =?1 ")
    Account findBynamAccount(String name);
    @Query("SELECT o FROM Account o WHERE o.sdt =?1 AND o.password = ?2")
    Account findBySdtAndPassword(String sdt, String password);
  
}

