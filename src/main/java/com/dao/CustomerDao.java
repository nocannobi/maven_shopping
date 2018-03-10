package com.dao;

import com.po.Customer;

import java.util.List;

public interface CustomerDao {
    Customer findCustomerByName(Customer customer);
    boolean addCustomer(Customer customer);
    boolean delCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    List<Customer> queryAllCustomer();
    Customer findCustomerById(Customer customer);
}
