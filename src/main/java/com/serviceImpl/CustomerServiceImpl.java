package com.serviceImpl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer queryCustomerByName(Customer customer) {
        if(customer == null) {
            return null;
        }
        return customerDao.findCustomerByName(customer);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        if(customer == null){
            return false;
        }

        return customerDao.addCustomer(customer);
    }

    @Override
    public boolean delCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return null;
    }

    @Override
    public Customer findCustomerById(Customer customer) {
        return null;
    }

    @Override
    public Customer query(Customer c) {
        return null;
    }

    @Override
    public Customer queryById(Integer id) {
        return null;
    }

    @Override
    public List<Customer> queryAll() {
        return null;
    }

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public boolean del(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }
}
