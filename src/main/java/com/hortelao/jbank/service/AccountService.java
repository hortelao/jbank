package com.hortelao.jbank.service;


import com.hortelao.jbank.dao.AccountDao;
import com.hortelao.jbank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao account;

    public Account createAccount(Account account) {
        return this.account.saveOrUpdate(account);
    }


}
