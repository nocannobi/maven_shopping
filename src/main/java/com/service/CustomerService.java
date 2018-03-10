package com.service;

import com.po.Customer;

import java.util.List;

public interface CustomerService extends QueryAndUpdateService<Customer>{
    Customer queryCustomerByName(Customer customer);
    boolean addCustomer(Customer customer);
    boolean delCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    List<Customer> queryAllCustomer();
    Customer findCustomerById(Customer customer);
}
