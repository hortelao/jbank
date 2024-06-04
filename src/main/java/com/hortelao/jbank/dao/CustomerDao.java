package com.hortelao.jbank.dao;

import com.hortelao.jbank.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CustomerDao {
    protected Class<Customer> modelType;
    @PersistenceContext
    private EntityManager entityManager;

    public Customer saveOrUpdate(Customer customer) {
        return entityManager.merge(customer);
    }

    public Customer findById(Long id) {
        return entityManager.find(modelType, id);
    }
}
