package com.turkcell.Abstract;

import com.turkcell.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("Save to Db : " +customer.FirstName);
    }
}
