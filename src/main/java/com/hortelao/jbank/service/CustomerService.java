package com.hortelao.jbank.service;

import com.hortelao.jbank.dao.CustomerDao;
import com.hortelao.jbank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customer;

    public Customer get(Long id) {
        return customer.findById(id);
    }

    public Customer addCustomer(Customer customer) {
        return this.customer.saveOrUpdate(customer);
    }

}
