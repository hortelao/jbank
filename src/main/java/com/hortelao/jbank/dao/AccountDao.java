package com.hortelao.jbank.dao;

import com.hortelao.jbank.model.Account;

import java.beans.JavaBean;

@JavaBean
public class AccountDao {

    public Account save(Account account) {
        return new Account();
    }
}
