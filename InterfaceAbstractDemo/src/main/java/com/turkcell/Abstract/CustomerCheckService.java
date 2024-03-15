package com.turkcell.Abstract;

import com.turkcell.Entities.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
