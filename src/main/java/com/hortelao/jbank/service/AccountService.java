package com.hortelao.jbank.service;


import com.hortelao.jbank.dao.AccountDao;
import com.hortelao.jbank.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {


    private AccountDao account;

    public Account createAccount(Account account) {
        return this.account.save(account);
    }


}
