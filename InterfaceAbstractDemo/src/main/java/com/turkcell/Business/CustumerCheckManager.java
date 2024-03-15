package com.turkcell.Business;

import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Abstract.CustomerService;
import com.turkcell.Entities.Customer;

public class CustumerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
