package com.hortelao.jbank.dao;

import com.hortelao.jbank.model.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.beans.JavaBean;

@Component
public class AccountDao {

    @PersistenceContext
    private EntityManager em;

    public Account save(Account account) {
        return new Account();
    }

    @Transactional
    public Account saveOrUpdate(Account modelObject) {
        return em.merge(modelObject);
    }
}
